package practice;
import java.util.*;
//import java.util.stream.IntStream;

public class SmallestIntegerInArray {
	// initiate arrays
	static int[] arr = {34, 15, 88, 2};
	
	public static void main(String[] args) {
		
		System.out.print(findSmallestint());
	}
	public static int findSmallestint(){
		//find smallest integer in array using sort
		Arrays.sort(arr);
		
		return arr[0];
		//return IntStream.of(args).min().getAsInt();
	}

}
