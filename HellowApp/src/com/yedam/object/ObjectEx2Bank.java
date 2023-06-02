package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	
	static Bank[] accounts = new Bank[3];
	static Scanner scn =new Scanner(System.in);
	
	public static void printAry() {
		for (Bank bank : accounts) {
			System.out.println(bank.getAccountNo());
		}
	}
	
	//조회할려는 계좌정보가 있는지 없는지
	public static boolean checkAccount(String accountNo) {
		boolean isExist =false;
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist=true;
				break;
			}
		}
		return isExist;
	}
	
	
	//계좌 등록 기능
	public static void registerAccount() {
		Bank ac =new Bank();
		for(int i=0 ;i <accounts.length;i++) {
			if(accounts[i]==null) {
				System.out.print("계좌번호 입력>");
//				ac.accountNo =scn.nextLine();
				ac.setAccontNo(scn.nextLine());
				System.out.print("예금주 입력>");
//				ac.owner =scn.nextLine();
				ac.setOwner(scn.nextLine());
				System.out.print("잔고 입력>");
//				ac.balance =Integer.parseInt(scn.nextLine());
				ac.setBalance(Integer.parseInt(scn.nextLine()));
				accounts[i] =ac;
				System.out.println("정상적으로 등록");
				break;
			}
		
		}
	}
	//계좌 정보 조회
	public static void searchAccount() {
		System.out.print("조회할 계좌번호>");
		String account = scn.nextLine();
		
		boolean accheck =false;
		
		for(int i=0 ;i <accounts.length;i++) {
			if(accounts[i]!=null && accounts[i]. getAccountNo().equals(account)) {
				System.out.printf("예금주 : %s, 잔액 : %d \n",accounts[i].getOwner(),accounts[i].getBalance());
				accheck =true;
				break;
			}
		}
		if(accheck == false) {
			System.out.println("계좌가 존재하지 않습니다");
		}
	}
	//입금
	public static void deposit() {
		System.out.print("조회할 계좌번호>");
		String account = scn.nextLine();
		
		
		boolean isTrue=checkAccount(account);
		if(!isTrue) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
//		boolean accheck =false;
//		for(int i=0 ;i <accounts.length;i++) {
//			if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//				accheck=true;
//				break;
//			}
//		}
//		if(!accheck) {
//			System.out.println("계좌가 존재하지 않습니다");
//			//continue;
//			return;
//		}
		System.out.print("금액>");
		int balance = Integer.parseInt(scn.nextLine());
		
		for(int i=0 ;i <accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
				accounts[i].setBalance(accounts[i].getBalance() +balance);
			}
		}
	}
	//츨금
	public static void withdraw() {
		System.out.print("조회할 계좌번호>");
		String account = scn.nextLine();
		
		boolean isTrue=checkAccount(account);
		if(!isTrue) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
		
//		boolean accheck =false;
//		for(int i=0 ;i <accounts.length;i++) {
//			if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//				accheck=true;
//				break;
//			}
//		}
//		if(!accheck) {
//			System.out.println("계좌가 존재하지 않습니다");
//			//continue;
//			return;
//		}
		
		
		System.out.print("금액>");
		int balance = Integer.parseInt(scn.nextLine());
		
		for(int i=0 ;i <accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
				accounts[i].setBalance(accounts[i].getBalance() - balance);
				//accounts[i].balance =accounts[i].balance -balance;
			}
		}
	}
	//삭제
	public static void removeAccount() {
		System.out.print("삭제할 계좌번호>");
		String account = scn.nextLine();
		
		for(int i =0; i< accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
				accounts[i]=null; // 값을 null 대체
				System.out.println("정상적으로 삭제되었습니다");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		//Bank[] accounts = new Bank[3]; //int [] {0,0,0}  /  Bank[] {null, null, null}
		//Scanner scn =new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.삭제 6.종료");
			System.out.print("선택>");
			int selectNo =Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {     //등록
				registerAccount();
//				Bank ac =new Bank();
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]==null) {
//						System.out.print("계좌번호 입력>");
////						ac.accountNo =scn.nextLine();
//						ac.setAccontNo(scn.nextLine());
//						System.out.print("예금주 입력>");
////						ac.owner =scn.nextLine();
//						ac.setOwner(scn.nextLine());
//						System.out.print("잔고 입력>");
////						ac.balance =Integer.parseInt(scn.nextLine());
//						ac.setBalance(Integer.parseInt(scn.nextLine()));
//						accounts[i] =ac;
//						System.out.println("정상적으로 등록");
//						break;
//					}
//				
//				}
				//String account =scn.nextLine();
				//String owner =scn.nextLine();
				// int balance =Integer.parseInt(scn.nextLine());
				//Bank.bank= new Bank();
				//bank.accountNo=account;
				//bank.owner=owner;
				//bank.balance=balance;
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]==null) {
//						accounts[i] =bank;
//						break;
//					}
//				}
//				
			}else if(selectNo ==2) {     //조회(계좌번호)
				
				searchAccount();
//				System.out.print("조회할 계좌번호>");
//				String account = scn.nextLine();
//				
//				boolean accheck =false;
//				
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null && accounts[i]. getAccountNo().equals(account)) {
//						System.out.printf("예금주 : %s, 잔액 : %d \n",accounts[i].getOwner(),accounts[i].getBalance());
//						accheck =true;
//						break;
//					}
//				}
//				if(accheck == false) {
//					System.out.println("계좌가 존재하지 않습니다");
//				}
				
				
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null) {
//						System.out.printf("계좌번호 : %s, 예금주 : %s, 잔고 : %d \n",accounts[i].accontNo,accounts[i].owner,accounts[i].balance);
//					}
//				}
			}else if(selectNo ==3) {                       //입급
				deposit();
//				System.out.print("조회할 계좌번호>");
//				String account = scn.nextLine();
//				
//				boolean accheck =false;
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//						accheck=true;
//						break;
//					}
//				}
//				if(!accheck) {
//					System.out.println("계좌가 존재하지 않습니다");
//					continue;
//				}
//				System.out.print("금액>");
//				int balance = Integer.parseInt(scn.nextLine());
//				
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//						accounts[i].setBalance(accounts[i].getBalance() +balance);
//					}
//				}
				
				
			}else if(selectNo ==4) {                       //출금
				withdraw();
//				System.out.print("조회할 계좌번호>");
//				String account = scn.nextLine();
//				
//				
//				boolean accheck =false;
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//						accheck=true;
//						break;
//					}
//				}
//				if(!accheck) {
//					System.out.println("계좌가 존재하지 않습니다");
//					continue;
//				}
//				
//				
//				System.out.print("금액>");
//				int balance = Integer.parseInt(scn.nextLine());
//				
//				for(int i=0 ;i <accounts.length;i++) {
//					if(accounts[i]!=null && accounts[i].getAccountNo().equals(account)) {
//						accounts[i].setBalance(accounts[i].getBalance() - balance);
//						//accounts[i].balance =accounts[i].balance -balance;
//					}
//				}
				
			}else if(selectNo ==5) {                       //삭제
				removeAccount();
			}
			
			
			else if(selectNo ==6) {                       //종료
				run = false;
			}
						
		}
		System.out.println("end of prog");
	}
}
