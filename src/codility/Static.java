package codility;

public class Static {
	static{
		
		String s = "Hello";
		
	}
	
	private static String s = "Hello";
	
	public static void main(String[] args) {
		print();
		Static stat = new Static();
		System.out.println(stat.s);
	}
	
	public static void print(){
		String s ="wew";
		System.out.println(s);
	}
}
