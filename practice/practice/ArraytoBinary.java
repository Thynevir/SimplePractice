package practice;

import java.util.*;
import java.util.stream.*;

public class ArraytoBinary {

	static List<Integer> binary = new ArrayList<>(Arrays.asList(1, 1, 1, 0));
	//14
	
	public static void main(String[] args) {
		
		System.out.print(BinaryConverter(binary));

	}

	public static int BinaryConverter(List<Integer> binary2) {
	//Given an array of ones and zeroes, convert the equivalent binary value to an integer.	
		return binary2.stream().reduce((x, y) -> x * 2 + y).get();
	}
}
