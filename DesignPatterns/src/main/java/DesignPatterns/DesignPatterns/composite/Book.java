package DesignPatterns.DesignPatterns.composite;

import java.util.List;

// elemento composito super
public class Book implements BookInterface{
	
	private List<String> authors;
	private double price;
	private Section sect;
	
	public Book(List<String> authors, double price) {
		this.authors = authors;
		this.price = price;
		sect = new Section();
	}
	
	public void addSection(Section s) {
		sect.addSection(s);
	}
	
	public void removeSection(Section s) {
		sect.removeSection(s);
	}
	
	public void addPagesToSection(Page p, Section s) {
		s.addPages(p);
	}
	
	@Override
	public void print() {
		System.out.println("BOOK PRINT HERE");
		System.out.println("Authors: " + authors);
		System.out.println("Price: " + price);
	}

	@Override
	public int getPages() {
		
		return sect.getPages();
	}

}
