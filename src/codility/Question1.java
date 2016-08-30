package codility;

public class Question1 {
	public static void main(String[] args){
		int [] A = {2,1,5,-6,9,5,4};
		final long start = System.nanoTime();
		System.out.println("pairs "+solution(A));
		final long end = System.nanoTime();
		System.out.println("Took: " + ((end - start) / 1000000) + "ms");
	}
	
	public static int solution(int [] list){
		int pairs = 0;
		int even=0;
		int odd=0;
		for(int num:list){
			if((num & 1) == 0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("even "+even);
		System.out.println("odd "+odd);
		while(even!=0){
			even--;
			pairs=pairs+even;
		}
		while(odd !=0){
			odd--;
			pairs=pairs+odd;
		}
		if(pairs == 1000000){pairs=-1;}
		return pairs;
	}
}
