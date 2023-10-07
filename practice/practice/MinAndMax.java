package practice;

import java.util.*;

public class MinAndMax {

	static int[] arr = {1, 2, 3, 4, 5};
	
	public static void main(String[] args) {
		//Arrays.toString to get value instead of reference
		System.out.print(Arrays.toString(minAndMax(arr)));

	}

	public static int[] minAndMax(int[] arr){
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		//find max using streams
		return new int[] {min,max};
	}
}
