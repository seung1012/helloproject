package com.yedam.classes;
// data: int [] :필드
// 기능 : 전체출력
//        합계
//       최대값
public class KorScore {
	//(인스턴스) 필드
	int[]kor= new int[] {100,80,70};
	
	//생성자, 기본생성자 KorScore() {}
//	KorScore(int[] scores){
//		kor=scores;
//	}
	//(인스턴스) 메소드
	public void print() {
		for(int score : kor) {
			System.out.println(score);
			
		}
	}
	
	public void total() {
		int sum=0;
		for( int score: kor) {
			sum +=score;
		}
		System.out.println(sum);
		
	}
	public void max() {
		int max=0;
		for (int score: kor) {
			if (max<score){
				max =score;
			}
		}
		System.out.println(max);
	}
}
