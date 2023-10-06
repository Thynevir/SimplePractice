package practice;

public class SentenceSmash {

	static String[] words = {"Bilal", "Djaghout"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(smash(words));
	}

	public static String smash(String... words) {
		
		return String.join(" ", words);
	}
}
