package reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		double[] dbAry = {89.5,78.9,90.4};
		dbAry = new double [] {55.5,44.4,66.6,77.7};
		double sum=0,avg=0,maxVal=0;
//		for(int i=0; i<3;i++ ) {
//			sum += dbAry[i];
//		}
		
		for(double a : dbAry) {
			sum += a;
			if(maxVal <a) {
				maxVal =a;
			}
		}
		
		avg= sum/4;
		System.out.printf("합: %.2f , 평균: %.2f , 최고점수: %.2f",sum,avg,maxVal);
	}
}
