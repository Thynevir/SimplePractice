package practice;

public class StringEndsWith {

	static String str = "Samurai";
	static String ending = "ra";
	
	public static void main(String[] args) {
		
		System.out.print(Solution());
	}
	
	public static boolean Solution() {
		
		return str.endsWith(ending);
	}
}
