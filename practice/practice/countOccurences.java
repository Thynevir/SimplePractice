package practice;

import java.util.*;
//import org.apache.commons.lang3.StringUtils;

public class countOccurences {

	static String str = "Hello";
	static char letter = 'o';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(strCount());
	}

	public static int strCount() {
		
		//using Apache Commons
		//return StringUtils.countMatches(str, letter);
		
		//using Stream chars(), filter(), and count()
		return (int) str.chars().filter(x -> x == letter).count();
	}
}
