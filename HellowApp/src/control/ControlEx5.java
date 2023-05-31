package control;

public class ControlEx5 {
	public static void main(String[] args) {
		boolean isTrue = false;
		int sum=0;
		isTrue= true;
		int cnt=0, avg=0;	
		
		do {
		System.out.println("do print");
		int result = (int)((Math.random()*6)+1);
		sum +=result;
		cnt++;
		if(sum>100)
			isTrue =false;
		}while(isTrue);
		
		avg=sum/cnt;	
		System.out.println("평균: "+avg );
		
		isTrue = true;
		cnt=0;
		
		while(isTrue) {
			
			if(cnt++ > 5) {
				isTrue=false;
			}
			
			if( cnt%2==0 ) {
				System.out.println("짝수입니다");
			}else {
				continue;//구문의 아래부분은 실행하지 않고 다음순번으로 이동
//				System.out.println("홀수입니다");
			}
		
			System.out.println("print");
		}
		System.out.println("end of prog");
	}
}
