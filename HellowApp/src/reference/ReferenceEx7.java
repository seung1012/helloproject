package reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		//학교학생 키 a반 2, b반 4,c반3
		double[][] heightAry = {
				{173.5, 168.3},
				{176.5, 163.3, 190.3, 188.3},
				{143.5, 128.3, 177.7}
		};
		
		System.out.println(heightAry[1].length);
		
		
		//각 반별로 키의 평균
//		double a=0,b=0,c =0;	
//		for(int i= 0; i < heightAry.length; i++) {
//			for(int j =0 ; j < heightAry[i].length; j++) {
//				if(i==0) {
//					a+=heightAry[i][j];
//				}else if (i==1) {
//					b+=heightAry[i][j];
//					
//				}else {
//					c+=heightAry[i][j];
//					
//				}
//			}
//		}
//		System.out.printf("A반 평균 키 : %.2f \n" , a/heightAry[0].length);
//		System.out.printf("B반 평균 키 : %.2f \n" , b/heightAry[1].length);
//		System.out.printf("C반 평균 키 : %.2f \n" , c/heightAry[2].length);
		
		
		for(int j=0; j<heightAry.length;j++) {
			double sum = 0;
			for(int i =0; i< heightAry[j].length;i++) {
				sum+= heightAry[j][i];
			}
			String fmt ="%d번째반의 평균키 : %.1f \n";
			System.out.printf(fmt,(j+1),(sum/heightAry[j].length));
		}
		
			
				
		
		
	}
}
