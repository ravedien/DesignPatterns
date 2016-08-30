package codility;


public class ArrayRecursion {
	public static void main(String[] args) {
		int[] arr = {9,1,5,10};
		System.out.println(sum(arr, arr.length-1));
	}
	
	public static int sum(int[] arr, int indx){
		if(indx == 0){
			return arr[indx];
		}else{
			return arr[indx] + sum(arr, indx - 1);
		}
	}
}
