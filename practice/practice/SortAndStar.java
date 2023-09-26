package practice;

import java.util.Arrays;

public class SortAndStar {

	static String[] s = {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
	
	public static void main(String[] args) {
		
		System.out.print(sortAndStar());

	}

	public static String sortAndStar(){
		//sort string array alphabetically
		Arrays.sort(s);
	    
		//String.join() concatenates the string using the delimiter "***" and then returns the string.
		//split string element at index 0
	    return String.join("***", s[0].split(""));
	  }
	}

