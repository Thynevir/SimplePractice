package practice;

public class Uppercase {

	static String str = "Hello World";
	
	public static void main(String[] args) {
		
		System.out.print(MakeUppercase(str));

	}

	public static String MakeUppercase(String str) {
		
		return str.toUpperCase();
	}
}
