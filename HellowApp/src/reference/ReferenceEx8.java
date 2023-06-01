package reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		//학생수 => 점수 입력, 점수출력, 최고점수, 평균점수
		Scanner scn =new Scanner(System.in);
		int studentNum=0; //학생수 지정
		int[] scores = null; // scores = new int[studentNum]
		boolean run= true;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo==1) {//학생수
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scn.nextLine());
			}else if(selectNo==2) { //점수 입력 , 배열의 크기만큼 학생의 점수
						if(studentNum == 0) {
							System.out.println("학생수 입력하시오");
							continue;
							}
						scores= new int[studentNum];
						for(int i=0 ; i<scores.length;i++) {
						System.out.printf("scores[%d] >",i);
						scores[i] = Integer.parseInt(scn.nextLine());
				}
			}else if(selectNo==3) { //배열의 점수 출력
						if(scores==null) {
							System.out.println("학생 점수 입력하시요");
							continue;
						}else {
							for(int i =0 ; i< scores.length;i++) {
								System.out.printf("scores[%d] > %d \n",i,scores[i]);
							}
						}
			}else if(selectNo==4) { // 최고 , 평균
					if(scores==null) {
						System.out.println("학생 점수 입력하시요");
						continue;
					}else {
						int sum=0;
						for(int i =0 ; i< scores.length;i++) {
							sum += scores[i];
						}
				
						int temp =0;
						for(int i= 0 ;i < scores.length-1;i++) {
							for(int j=0;j <scores.length-1-i;j++) {
								if(scores[j] < scores[j+1]) {
									temp = scores[j];
									scores[j]=scores[j+1];
									scores[j+1]=temp;
								}
							}
						}
				 
						System.out.printf("최고점수 : %d , 평균 : %d \n",scores[0],sum/scores.length);
					}
			}else if(selectNo==5) { //종료 : 프로그램 종료합니다. break or false
				run = false;
			}
			
		}
		System.out.println("end of prog");
	}
}
