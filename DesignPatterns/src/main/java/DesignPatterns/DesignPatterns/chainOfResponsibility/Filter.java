package DesignPatterns.DesignPatterns.chainOfResponsibility;

import lombok.Data;

@Data
public abstract class Filter {
	private Filter next;

	public abstract void check(long salary, Role role);

	public void goNext(long salary, Role role) {
		if (this.getNext() != null) {
			next.check(salary, role);
		} else {
			System.out.println("CHAIN END");
		}
	}
}
