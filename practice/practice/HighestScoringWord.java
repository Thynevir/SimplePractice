package practice;

public class HighestScoringWord {
	
	public static String s = "what time are we climbing up to the volcano";

	public static void main(String[] args) {
		
		System.out.print(highScore(s));

	}

	public static String highScore(String s) {
	    
		String winner = "";
	    int highScore = 0;
	    
	    for (String word : s.split(" ")) {
	        int score = 0;
	        for (char c : word.toCharArray()) {
	          score += c - 'a' + 1;
	        }
	        if (score > highScore) {          
	          winner = word;
	          highScore = score;
	        }
	    }
	    
	    return winner;
	  }
}
