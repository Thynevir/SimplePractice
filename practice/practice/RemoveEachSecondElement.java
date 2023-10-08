package practice;

import java.util.Arrays;

public class RemoveEachSecondElement {

	static Object[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		
		System.out.print(Arrays.toString(removeEveryOther(arr)));

	}

	public static Object[] removeEveryOther(Object[] arr){
		
		Object[] output = new Object[(arr.length + 1)/2];
		
		for(int i = 0; i<output.length;i++) {
			
			output[i] = arr[i*2];
		}
		
		return output;
	}
}
