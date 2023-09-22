package practice;

import java.util.*;
import java.util.stream.*;

public class Isogram {

	static String str = "Dermatoglyphicss";
	//moOse
	//moose
	
	public static void main(String[] args) {
	      
			System.out.print(IsogramCalc());
	    } 
	
	public static boolean IsogramCalc() {
		/* nest for-loop
		 * for(int i=0;i<str.length();i++){
		 * for(int j=i+1;j<str.length();j++){
		 *  
		 *  if(str.charAt(i) == str.charAt(j)){
		 *  	
		 *  	return false;
		 *   }
		 *  }
		 * }
		 * return true;
		 */
		
		// convert string to lowercase, chars() to, 
		//if the number of distinct characters in the string is not the same as the total number of 
		//characters, you know there's a duplicate
		return str.length() == str.toLowerCase().chars().distinct().count();
	}
}