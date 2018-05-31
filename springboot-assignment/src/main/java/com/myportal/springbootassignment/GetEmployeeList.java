package com.myportal.springbootassignment;

public class GetEmployeeList {

	int EmpId;
	String EmpName;
	String EmpDesignation;
	public GetEmployeeList() {
		super();
	}
	public GetEmployeeList(int empId, String empName, String empDesignation) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpDesignation = empDesignation;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		EmpDesignation = empDesignation;
	}

	
}
