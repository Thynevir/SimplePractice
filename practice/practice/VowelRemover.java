package practice;

public class VowelRemover {

	static String input = "hello";
	
	public static void main(String[] args) {
		
		System.out.print(vowelRemover());
		
	}

	public static String vowelRemover() {
		//ignore uppercase vowels
		
		if(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")){
		      
		      input = input.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "").toLowerCase();
		      //could've simplified .replaceAll statement with:
		      //input.replaceAll("[aeiou]", "");
	    }
		
		return input;
	}
}
