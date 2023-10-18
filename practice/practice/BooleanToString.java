package practice;

public class BooleanToString {
	
	public static boolean b = true;

	public static void main(String[] args) {

		System.out.print(boolToString(b));

	}

	public static String boolToString(boolean b) {
		
		return (b == true) ? "Yes":"No";
	}
}
