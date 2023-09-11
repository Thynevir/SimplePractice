package practice;

import java.util.*;
import static java.util.stream.LongStream.rangeClosed;

public class PowersOf2 {
	
	static int n = 4;

	public static void main(String[] args) {
		
		System.out.print(Arrays.toString(powersOfTwo()));
	}

	public static long[] powersOfTwo(){
		
		long[] arr = new long[n+1];
	    
	    for(int i = 0; i<arr.length ;i++){
	      
	      arr[i] = (long) (Math.pow(2, i));
	    }
	    return arr;
		//return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
	}
}
