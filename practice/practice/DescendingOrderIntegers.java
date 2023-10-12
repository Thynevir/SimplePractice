package practice;

import java.util.*;

public class DescendingOrderIntegers {

	static int num = 587032164;
	
	public static void main(String[] args) {
		
		System.out.print(DescendingOrder(num));

	}

	static public int DescendingOrder(int num) {
		//convert int to String, and return string representation
		String[] list = String.valueOf(num).split("");
		
		//sort array using collections
		Arrays.sort(list, Collections.reverseOrder());
		
		return Integer.valueOf(String.join("", list));
	}
}
