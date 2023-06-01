package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3]; //int [] {0,0,0}  /  Bank[] {null, null, null}
		Scanner scn =new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택>");
			int selectNo =Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {     //등록
				Bank ac =new Bank();
				for(int i=0 ;i <accounts.length;i++) {
					if(accounts[i]==null) {
						System.out.print("계좌번호 입력>");
						ac.accontNo =scn.nextLine();
						System.out.print("예금주 입력>");
						ac.owner =scn.nextLine();
						System.out.print("잔고 입력>");
						ac.balance =Integer.parseInt(scn.nextLine());
						accounts[i] =ac;
						break;
					}
				}
			}else if(selectNo ==2) {                       //조회(계좌번호)
				for(int i=0 ;i <accounts.length;i++) {
					if(accounts[i]!=null) {
						System.out.printf("계좌번호 : %s, 예금주 : %s, 잔고 : %d \n",accounts[i].accontNo,accounts[i].owner,accounts[i].balance);
					}
				}
			}else if(selectNo ==3) {                       //입급
				
			}else if(selectNo ==4) {                       //출금
				
			}else if(selectNo ==5) {                       //종료
				run = false;
			}
						
		}
		System.out.println("end of prog");
	}
}
