package practice;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] numbers = {1, 2, 3};
	public static int target = 4;

	public static void main(String[] args) {
		
		System.out.print(Arrays.toString(twoSum(numbers, target)));

	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int sum = 0;
		
		for(int i = 0;i<numbers.length;i++){
	        for(int j = i+1;j<numbers.length;j++) {
	        	
	        	if(numbers[i]+ numbers[j] == target) {
	        		return new int[] {i, j};
	        	}
	        }
	        
	      }
		
		return null;
	}
}
