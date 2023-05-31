package control;

public class ControlEx1 {
		public static void main(String[] args) {
			// 0~1사이의 임의의 수를 생성
			int result =(int)(Math.random() * 91) +10; 
//			while (true) {
//				result =(int)(Math.random() * 91) +10; 
//				System.out.println(result);
//				if(result==100) {
//					break;
//				}
//			}
//			
			
			
			System.out.println(result);
			if (result >=90) {
				System.out.println("A");
			}else if(result >=80){
				System.out.println("B");
			}else if(result >=70){
				System.out.println("C");
			}else {
				System.out.println("D");
			}
		}
}
