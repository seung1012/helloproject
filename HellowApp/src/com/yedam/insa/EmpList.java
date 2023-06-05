package com.yedam.insa;

import java.util.Scanner;

//사원 정보 배열, 등록 ,조회 ,출력
public class EmpList {
	
	//싱글턴
	private static EmpList instance= new EmpList();
	public static EmpList getInstance() {
		return instance;
	}
	//정보저장공간
	Employee[] list;
	int empNum; //사원수
	Scanner scn= new Scanner(System.in);
	
	//생성자
//	private EmpList(){}
//	
//	private EmpList(Employee[] list){
//		this.list=list;
//		this.empNum= list.length;
//	}
//	
	//초기화
	public void init() {
		System.out.println("사원수>");
		int num = scn.nextInt(); //3 enter
		list= new Employee[num];
	}
	//등록
	public void input() {
		if(empNum >=list.length) {
			System.out.println("일력초과");
			return;
		}
		
		System.out.printf("%d 사번>",empNum);
		int no= scn.nextInt();
		System.out.print("이름>");
		String name= scn.next(); //enter
		System.out.print("급여정보>");
		int sal =scn.nextInt();
		
		list[empNum++]=new Employee(no,name,sal);
	}
	//조회
	public String search(int employeeId) {
		for (int i=0; i<list.length; i++) {
			if(list[i].getEmployeeId() ==employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}
	//전체출력
	public void print () {
		for(int i=0; i<list.length; i++) {
			System.out.printf("%5d %10s %7d\n",list[i].getEmployeeId(),list[i].getName(),list[i].getSalary());
		}
	}
	public int sum() {
		int sum=0;
		for (int i=0; i<list.length; i++) {
			if(list[i] !=null) {
				sum +=list[i].getSalary();
				}
			}
		return sum;
	}
	
}