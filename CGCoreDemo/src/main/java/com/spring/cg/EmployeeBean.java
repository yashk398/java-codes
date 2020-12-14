package com.spring.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private int empId;
	private String name;
//	@Autowired
//	@Qualifier("Department2")
	private DepartmentBean dept; 
	
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentBean getDept() {
		return dept;
	}

	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}

	public EmployeeBean(int empId, String name, DepartmentBean dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
