package practice;

import java.util.*;
import java.util.stream.*;

public class CapitalizeEachWord {

	static String phrase = "this is a test string";
	
	public static void main(String[] args) {

		System.out.print(Capitalizer(phrase));
		
	}

	public static String Capitalizer(String phrase) {
		if(phrase == null || phrase.isEmpty()){
		      
		      return null;
		    }
		
		char[] array = phrase.toCharArray();
		
		for(int i = 0; i < phrase.length();i++) {
			
			if(i==0 || array[i-1] == ' ') {
				
				array[i] = Character.toUpperCase(array[i]);
			}
			
		}
		
		return new String(array);
		/* stream solution
		return Arrays.stream(phrase.split(" "))
        .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
        .collect(Collectors.joining(" "));
        */
	}
	
}
