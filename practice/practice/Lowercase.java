package practice;

public class Lowercase {
	
	static String str = "Hello World";

	public static void main(String[] args) {

		System.out.print(MakeLowercase(str));
		
	}

	public static String MakeLowercase(String str) {
		
		return str.toLowerCase();
	}
}
