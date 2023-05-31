package control;

public class ControlEx4 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}
	
	public static void method1() {
		int result=0;
		for(int i=1 ;i <=100;i++) {
			if(i%3==0)
				result +=i;
		}
		System.out.println(result);
	}
	public static void method2() {
		while(true) {
			int num1 = (int)(Math.random()*10 % 6 )+1;
			int num2 = (int)(Math.random()*10 % 6 )+1;
			System.out.printf("num1: %d , num2: %d  \n",num1,num2);
			if(num1 +num2 == 5)
				break;
		}
	}
	public static void method3() {
		for(int i =1; i <=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			
			}
			System.out.printf("\n");
		}
	}
	
	public static void method4() {
		for(int i=1; i<=4;i++) {
			String str ="";
			for( int j=1; j <=4-i;j++) {
				str +=" ";
				
			}
			for(int k=1;k<=i;k++) {
				str +="*";
				
			}
			System.out.printf(str);
			System.out.printf("\n");
		}
	}
}
