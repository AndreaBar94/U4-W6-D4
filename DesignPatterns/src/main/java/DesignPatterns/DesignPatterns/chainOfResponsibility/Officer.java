package DesignPatterns.DesignPatterns.chainOfResponsibility;

import lombok.Data;

@Data
public class Officer {
	private long salary;
	private Role role;
	private Officer superiorOfficer;
	
	public Officer(long salary, Role role) {
		super();
		this.salary = salary;
		this.role = role;
		
	}
	
	 public void setSuperiorOfficer(Officer superiorOfficer) {
	        this.superiorOfficer = superiorOfficer;
	 }
	 
	 
}
