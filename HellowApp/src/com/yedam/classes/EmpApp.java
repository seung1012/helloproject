package com.yedam.classes;
//사원 정보를 저장
//사원 클래스(Employee) - 부서 클래스(Department)
public class EmpApp {
	public static void main(String[] args) {
		Department dept1= new Department(10,"인사",120);
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("인사");
		dept1.setmanagerId(120);
		Department dept2= new Department(20,"기획");
		dept2.setmanagerId(130);
		System.out.println(dept1.toString());
		System.out.println(dept2.toString());
		
		Employee emp1= new Employee();
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);
		
		System.out.println("부서번호: "+emp1.getDept().getDeaprtmentName());
		
		Employee emp2= new Employee(201,"민수","김",dept1);
		
		Employee emp3= new Employee(203,"이수","김",new Department(30,"개발",150));
	}
}
