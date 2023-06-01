package reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		
		int a=34;//(int)(Math.random()*100);
		int b=85;
		int c=22;
		
		//제일 큰 수 => intAry 의 첫번째
		int temp=0;
		int[] intAry = new int[] {a,b,c};
	    for(int i= 0 ;i < intAry.length-1;i++) {
	    	for(int j=0;j <intAry.length-1-i;j++) {
	    		if(intAry[j] < intAry[j+1]) {
	    			temp = intAry[j];
	    			intAry[j]=intAry[j+1];
	    			intAry[j+1]=temp;
	    		}
	    	}
	    }
		for(int ar: intAry) {
			System.out.println(ar);
		}
		
		
		
	}
}
