package codility;

public class OddOccurenceInArray {
	public static void main(String [] args){
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(solution(A,A.length));
	}
	static int solution(int A[], int N) {
	    
	    if (A.length==1)
	            return A[0];
	        int oe = 0;
	        for (int i=0; i<A.length; i++){
	        	System.out.println("A"+i+"-"+Integer.toBinaryString(A[i]));
	        	System.out.println("oe"+oe+"-"+Integer.toBinaryString(oe));
	            oe ^= A[i];
	            System.out.println("oe"+oe+"-"+Integer.toBinaryString(oe));
	            System.out.println("");
	        }
	        	
	            
	        return oe;
	}
}
;