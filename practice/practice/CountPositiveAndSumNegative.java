package practice;

import java.util.*;
//import java.util.stream.*;

public class CountPositiveAndSumNegative {

	static int sum = 0;
	static int count = 0;
	static int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
	//should return [10, -65]
	
	public static void main(String[] args) {
		
		
		System.out.print(Arrays.toString(calc()));
	}
	
	public static int[] calc(){
		
		if (input == null || input.length == 0) { 
			
			return new int[] {};}
		
	       int count = 0,sum = 0;
	       for (int i : input) {
	         if (i > 0) count ++;
	         if (i < 0) sum += i;
	       }
	       return new int[] {count,sum};
		
		/*pos = (int)IntStream.of(array).filter(i->i>0).count();
		neg = IntStream.of(array).filter(i->i<0).sum();
		return new int[] {count, sum} ;*/
	  }
	}
