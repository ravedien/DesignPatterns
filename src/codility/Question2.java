package codility;
import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int[] a = {8,24,3,20,1,17};
		Arrays.sort(a);
		int smallestDiff = a[1]-a[0];
		for(int cnt = 2;cnt<a.length;cnt++){
			smallestDiff = Math.min(smallestDiff, a[cnt]-a[cnt-1]);
		}
		System.out.println(smallestDiff);
	}
}
