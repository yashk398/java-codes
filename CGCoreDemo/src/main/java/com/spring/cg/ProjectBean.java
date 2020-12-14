package com.spring.cg;

public class ProjectBean {
	private String name;
	private String department;
	
	public ProjectBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Done Construction of Class with Java");
	}

	public ProjectBean(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "MessagePrinterBean [name=" + name + ", department=" + department + "]";
	}
	
}
