package reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		int[] intAry = {30,40,50};
		double[] dbAry= {30.0,40,50};
		String[] strAry= {"H","E","L","L","o"};
		int[] intAry2= new int[3]; //0,0,0
				
		//배열의 크기는 한번 정해지면 불변
//		intAry[3]33;
		System.out.println(intAry[0]);
		intAry[0]=3;
		System.out.println(intAry[0]);
		
		int sum= intAry[0]+intAry[1]+intAry[2];
		sum=0;
		for(int i=0; i<3; i++) {
			sum += intAry[i];
		}
		for(String str: strAry) {
			System.out.println(str);
		}
		
		
		System.out.println("sum: "+sum);
		double sum1= dbAry[0]+dbAry[1]+dbAry[2];
	}
}
