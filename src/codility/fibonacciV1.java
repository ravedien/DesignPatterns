package codility;
public class fibonacciV1 {
	public static void main(String[] args) {
		long n = 10;
		long startTime = System.nanoTime();
		System.out.println("getFibonacciV1: "+getFibonacciV1(n));
		System.out.println("NanoTime: "+(System.nanoTime() - startTime));
		System.out.println();
//		startTime = System.nanoTime();
//		System.out.println("getFibonacciV2: "+getFibonacciV2(n));
//		System.out.println("NanoTime: "+(System.nanoTime() - startTime));
//		BigInteger a= BigInteger.ZERO;
//		BigInteger b= BigInteger.ONE;
//		System.out.println(a.compareTo(a)<0);
	}

	public static long getFibonacciV1(long n) {
		  if(n < 2) {
		    return n;
		  }
		  long a = 0, b = 1;
		  long ans = 0;
		  for(int i=1;i<n;i++) {
		    ans = a + b;
		    System.out.println("loop["+i+"]="+ans);
		    a = b;
		    b = ans;
		  }
		  return ans;
	}
	
	public static long getFibonacciV2(long n) {
		  if(n < 2) {
		    return n;
		  }
		  
		  return getFibonacciV2(n-2)+getFibonacciV2(n-1);
	}
}
