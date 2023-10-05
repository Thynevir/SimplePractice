package practice;

public class Accumulate {

	static String s = "ZpglnRxqenU";
	
	public static void main(String[] args) {
		
		System.out.print(accumulate());

	}

	public static String accumulate() {
		//Stringbuilder because it is mutable
		StringBuilder bldr = new StringBuilder();
	    int i = 0;
	      
	      for(char c : s.toCharArray()) {
	      
	        if(i > 0) {
	        //append - after every sequence of characters
	        bldr.append('-');
	        }
	      //first letter of each sequence of chars is Uppercase.  
	      bldr.append(Character.toUpperCase(c));
	        
	      for(int j = 0; j < i; j++) {
	    	  //all char after first one are lower case in each sequence
	        bldr.append(Character.toLowerCase(c));
	    }
	      i++;
	  }
	      return bldr.toString();
 }
}
