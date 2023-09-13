package practice;

import java.util.Arrays;

public class NumberToReversedArray {
	
	static int n = 35231;

	public static void main(String[] args) {
		
		//Arrays.toString() used for printing string
		System.out.append(Arrays.toString(digitize()));
	}
	
	public static int[] digitize(){
		//initializing s with String valueOf method
		String s = String.valueOf(n);
		int length = s.length();
		int[] array = new int[length];
		
		for(int i =0; i < length;i++) {
			
			//Casting a char to int returns its ascii value. The ascii value for '0' 
			//for example is 48, so subtracting 48 from it will convert it into its proper 
			//int value.
			array[i] = (int) (s.charAt(length - i - 1)) -48;
		}
		
		return array;
	}

}
