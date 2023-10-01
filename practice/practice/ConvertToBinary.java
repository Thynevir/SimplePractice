package practice;

public class ConvertToBinary {

	static int a = 5;
	static int b = 5;
	
	public static void main(String[] args) {
		
		System.out.print(binaryConverter());

	}

	public static String binaryConverter() {
		
		String Binary = Integer.toBinaryString(a+b);
		return Binary;
	}
}
