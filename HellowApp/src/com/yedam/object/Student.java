package com.yedam.object;

public class Student {
	private String stuid;
	private String name;
	private String gender;
	private int grade;
	
	// constructor.
	public Student(String stdNo, String stdName, String gender, int score) {
		this.stuid = stdNo;
		this.name = stdName;
		this.gender = gender;
		this.grade = score;
	}
	
	
	void setStuid(String stuid) {
		this.stuid=stuid;
	}
	void setName(String name) {
		this.name=name;
	}
	void setGender(String gender) {
		this.gender=gender;
	}
	void setGrade(int grade) {
		this.grade=grade;
	}
	
	String getStuid() {
		return this.stuid;
	}
	String getName() {
		return this.name;
	}
	String getGender() {
		return this.gender;
	}
	int getGrade() {
		return this.grade;
	}
	public void showInfo() {
		System.out.printf("학번 %s, 이름 %s, 점수 %d \n", stuid, name, grade);
	}

}
