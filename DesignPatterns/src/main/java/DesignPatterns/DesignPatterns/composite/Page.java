package DesignPatterns.DesignPatterns.composite;

//elemento foglia
public class Page implements BookInterface{
	
	private int pagesNumber;
	
	
	public Page(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}
	
	@Override
	public void print() {
		System.out.println("PAGE PRINT HERE");
		System.out.println("Pages number: " + pagesNumber);
		
	}

	@Override
	public int getPages() {

		return this.pagesNumber;
	}

}
