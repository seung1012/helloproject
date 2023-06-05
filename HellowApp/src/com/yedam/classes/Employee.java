package com.yedam.classes;

public class Employee {
	//필드
	private int employeeId;
	private String firstName;
	private String LastName;
	private Department dept;
	
	//생성자
	Employee(){
		
	}
	
	Employee(int employeeId,String firstName){
		this.employeeId=employeeId;
		this.firstName=firstName;
	}
	Employee(int employeeId,String firstName,String LastName, Department dept){
//		this.employeeId=employeeId;
//		this.firstName=firstName;
		this(employeeId,firstName); // 정수, 문자열 생성자 호출
		this.LastName=LastName;
		this.dept=dept;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", LastName=" + LastName + ", dept="
				+ dept + "]";
	}
	
	
}
