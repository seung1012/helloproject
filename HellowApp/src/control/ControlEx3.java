package control;

public class ControlEx3 {
	public static void main(String[] args) {
//		String days= "Sun Mon Tue Wed Thr Fri Sat";
//		System.out.println("------------6월달------------");
//		System.out.println(days);
//		System.out.println("===========================");
//		System.out.printf("%16s", "");
//		for(int day =1 ; day <=30; day++) {
//			System.out.printf("%3d ",day);
//	        if ( day %7==3) {
//	        	System.out.printf("\n");
//	        }
//		}
		
		String days= "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		int num=4;
		for(int i=0;i<getFirstDate(num);i++) {
			System.out.printf("%4s","");
		}
		for(int day =1 ; day <=getLastDate(num); day++) {
			System.out.printf("%3d ",day);
			if ( day %7==(7-getFirstDate(num))) {
				System.out.printf("\n");
			}
		}
	}
	
	
	//4,5,6달만
	public static int getFirstDate(int month) {
		int result =0;
		switch(month) {
		case 4:
			result =6;
			break;
		case 5:
			result=1;
			break;
		case 6:
			result=4;
			break;
		}
		return result;
		
	}
	public static int getLastDate(int month) {
		int result=0;
		switch(month) {
		
		case 2:
			result=28;
			break;		
		case 4:	
		case 6:		
		case 9:		
		case 11:
			result=30;
			break;
		default:
			result=31;
		
		}
		return result;
	}
	
	
	
	
	public static void method2() {
//		for (int num=2; num <=9;num++) {
//		System.out.printf("%d단입니다 \n",num);
//		for(int i=1; i<6;i++) {
//			System.out.printf("%d x %d = %d \n",num,i,num*i);
//		}
//	}
//	
		for(int j=1; j<10;j++) {
			for(int i =2 ; i<10;i++) {
				System.out.printf(" %d  x  %d = %d  \t",i,j,j*i);
			}
			System.out.printf("\n");
		}
		
	}
	
	
	public static void method1() {
		for(int i=0; i<10; i++) {
			if (i%2==1)
				System.out.printf("1의 값은 %d \n",i);
			else
				System.out.println("짝수입니다.");
		}
	}//end of method1
}
