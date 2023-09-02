package practice;

import java.util.*;

public class SquareNumOrNot {

	static int num = 5;
	
	public static void main(String[] args) {
		
		System.out.println(IsSquare());
	}
	public static boolean IsSquare() {
		
		return Math.sqrt(num) % 1 == 0;
	}
}
