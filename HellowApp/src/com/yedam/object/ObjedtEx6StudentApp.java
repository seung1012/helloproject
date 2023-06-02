package com.yedam.object;
import java.util.Scanner;

public class ObjedtEx6StudentApp {
	//학생정보관리 APP
	//1.등록 2.목록 3.조회(이름) 4.수정(정수)5.삭제 6.종료
	//학생정보 : 학색번호/이름/성별(남,여)/점수
	static Scanner scn =new Scanner(System.in);
	static Student[] students = new Student[3];
	
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정 5.삭제 6.종료");
			System.out.print("선택>");
			int selectNo =Integer.parseInt(scn.nextLine());
			
			if(selectNo ==1) {
				register();
			}else if(selectNo==2) {
				list();
			}else if(selectNo==3) {
				 search();
			}else if(selectNo==4) {
				modify();
			}else if(selectNo==5) {
				remove();
			}else if(selectNo==6) {
				run = false;
			}
		}
		
		System.out.println("end of prog");
	}//end of main
	//1.register() 2.list() 3.search() 4.modify() 5.remove 6.
	                //남-1명 여-2명 최고점수:이름 - 100점 
	
	public static void register() {
		Student stu = new Student();
		System.out.print("학생번호 입력>");
		String id =scn.nextLine();
		System.out.print("이름 입력>");
		String name =scn.nextLine();
		System.out.print("성별 입력>");
		String gen =scn.nextLine();
		System.out.print("점수 입력>");
		int grade=Integer.parseInt(scn.nextLine());
		
		stu.setStuid(id);
		stu.setName(name);
		stu.setGender(gen);
		stu.setGrade(grade);
		
		for(int i=0; i<students.length;i++) {
			if(students[i]==null) {
				students[i]=stu;
				break;
			}
		}
		
	}//end of register
	
	public static boolean checkStudent(String id) {
		boolean isExit = false;
		for(int i =0 ; i<students.length;i++) {
			if(students[i] != null && students[i].getStuid().equals(id)) {
				isExit = true;
				break;
			}
		}
		return isExit;
	}// end of checkStudent
	
	public static void list() {
		int maxvalue=0, bcnt=0,gcnt=0;
		String m ="";
		for(int i =0 ; i<students.length;i++) {
			if(students[i] != null ) {
				if(students[i].getGender().equals("남")) {
					bcnt++;
				}
				if(students[i].getGender().equals("여")) {
					gcnt++;
				}
				
					if(students[i].getGrade()>maxvalue) {
						maxvalue=students[i].getGrade();
						m=students[i].getName();
				}		
			}
		}
		System.out.printf("남자수: %d, 여자수: %d, 최고점수:%s---%d \n",bcnt,gcnt,m,maxvalue);
	}// end of list
	public static void search() {
		System.out.print("조회할 학생>");
		String searchName = scn.nextLine();
		boolean check =false;
		for(int i=0 ;i <students.length;i++) {
			if(students[i]!=null && students[i].getName().equals(searchName)) {
				System.out.printf("아이디: %s, 이름: %s, 성별: %s, 점수: %d \n",students[i].getStuid(),students[i].getName(),students[i].getGender(),students[i].getGrade());
				check=true;
			} 
		
		}
		if(check==false) {
			System.out.println("등록된 학생이 없습니다");		
		}
		
	}//end of search
	public static void modify() {
		System.out.print("수정할 학생ID>");
		String modId = scn.nextLine();
				
		boolean isTrue=checkStudent(modId);
		if(!isTrue) {
			System.out.println("학생이 존재하지 않습니다");
			return;
		}
		System.out.print("점수 수정>");
		int modGrade= Integer.parseInt(scn.nextLine());
		
		for(int i=0 ;i <students.length;i++) {
			if(students[i]!=null && students[i].getStuid().equals(modId)) {
				students[i].setGrade(modGrade);
			}
		}
		
	}//end of modify
	public static void remove() {
		System.out.print("삭제할 학생ID>");
		String removeId = scn.nextLine();
		
		boolean isTrue=checkStudent(removeId);
		if(!isTrue) {
			System.out.println("학생이 존재하지 않습니다");
			return;
		}
		
		for(int i =0; i< students.length;i++) {
			if(students[i]!=null && students[i].getStuid().equals(removeId)) {
				students[i]=null; // 값을 null 대체
				System.out.println("정상적으로 삭제되었습니다");
				break;
			}
		}
	}
}
