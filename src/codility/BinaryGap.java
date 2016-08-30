package codility;

public class BinaryGap {

	public static void main(String[] args){
		System.out.println(solution(328));
	}
	
	public static int solution(int n){
		String binary = Integer.toBinaryString(n);
		String[] binaryArray = binary.split("1");
		int gap = 0;
		for(String s : binaryArray){
			gap = Math.max(s.length(), gap);
		}
        return gap;
	}
}