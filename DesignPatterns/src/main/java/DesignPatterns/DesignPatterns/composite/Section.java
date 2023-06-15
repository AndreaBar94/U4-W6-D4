package DesignPatterns.DesignPatterns.composite;

import java.util.ArrayList;
import java.util.List;

//elemento composito
public class Section implements BookInterface {
	
	public List<BookInterface> sections;
	
	public Section() {
		sections = new ArrayList<>();
	}
	
	public void addSection(BookInterface e) {
		sections.add(e);
	}
	
	public void removeSection(BookInterface e) {
		sections.remove(e);
	}
	
	public void addPages(Page p) {
		sections.add(p);
	}
	@Override
	public void print() {
		System.out.println("SECTION PRINT HERE");
		for(BookInterface section : sections) {
			section.print();
		}
		
	}

	@Override
	public int getPages() {
		int pagesNumber = 0;
		for(BookInterface section : sections) {
			pagesNumber += section.getPages();
		}
		return pagesNumber;
	}

}
