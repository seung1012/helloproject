package control;

public class ControlEx2 {
	public static void main(String[] args) {
		System.out.println("3월달의 마지막날은 " +getLastDate(3));
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
	
	
	
	public static void method1() {
		int result = (int) (Math.random()*3)+1;
		switch(result) {
			case 1:
				System.out.println("가위");
				break;
			case 2:
				System.out.println("바위");
				break;
			case 3:
				System.out.println("보");
				break;
			}
		result=(int)(Math.random()*91)+10;
		switch(result/10) {
		case 10:
			System.out.println("A++");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		
		System.out.println("end of prog");
	}
}
