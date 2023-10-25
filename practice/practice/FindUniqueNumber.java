package practice;

import java.util.*;

public class FindUniqueNumber {

	static double arr[] = {1,1,1,2,1,1};
	
	public static void main(String[] args) {
		
		System.out.print(findUniq(arr));

	}
	
	public static double findUniq(double arr[]) {
		//if sorted the unique number can only be the first or 
		//last element in the array
		Arrays.sort(arr);
	      if (arr[0] == arr[1]) {
	        return arr[arr.length-1];
	      }
	      else
	        return arr[0];
	}
}
