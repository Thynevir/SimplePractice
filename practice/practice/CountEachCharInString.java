package practice;

import java.util.*;
import java.util.stream.*;

public class CountEachCharInString {
	
	public static String str = "aabbbac";

	public static void main(String[] args) {
		
		System.out.print(count(str));

	}
	
	public static Map<Character, Integer> count(String str) {
        
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(Character character: str.toCharArray()) {
			
			if(charMap.containsKey(character)) {
				
				charMap.put(character, charMap.get(character) + 1);
			} else {
				charMap.put(character, 1);
			}
		}
		
        return charMap;
    }

}
