package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[3];
		
		
		for(int i =0;i<members.length;i++) {
			Member m1= new Member();
			System.out.print("아이디를 입력>");
			String id =scn.nextLine();
		// i=0 이면 처음등록
		// i !=0  5번째 등록 1,2,3,4 비교
			boolean idcheck = false;
			if(i != 0) {
				for(int j =0; j< i; j++) {
					if(members[j].memberId.equals(id)) {
						System.out.println("=====아이디 다시입력======");
						idcheck =true;
						break;
					}
				}
			}
			if(idcheck ==true) {
				i--;
				continue;
			}
			m1.memberId =id;
//			m1.memberId=scn.nextLine();
			System.out.print("이름을 입력>");
			m1.memberName=scn.nextLine();
			System.out.print("포인터를 입력>");
			m1.point=Integer.parseInt(scn.nextLine());
		
			members[i]=m1;
		}
		
		
		// memberId  조회 후 point를 변경
//		System.out.println("조회할 아이디를 입력");
//		String searchId= scn.nextLine();
//		System.out.println("변경할 point를 입력");
//		int newPoint =Integer.parseInt(scn.nextLine());
//		
//		for(int i =0;i<members.length;i++) {
//			if(members[i].memberId.equals(searchId)) {
//				members[i].point = newPoint;			
//			}
//		}
		
		
		for(int i =0;i<members.length;i++) {
				System.out.printf("아이디: %s, 이름: %s, point: %d \n",members[i].memberId,members[i].memberName,members[i].point);
				}
	}
}
