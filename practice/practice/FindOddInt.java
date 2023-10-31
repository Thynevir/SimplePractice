package practice;

import java.util.*;

public class FindOddInt {

	static int[] a = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
	//5
	
	public static void main(String[] args) {
		
		System.out.print(Findit(a));

	}

	public static int Findit(int[] a) {
		
		int odd = 0;
		
	    for(int i =0;i<a.length;i++){
	      
	      odd ^= a[i];
	   // XOR will cancel out everytime you XOR with the same number so 
	   //1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
	    }
		
		return odd;
	}
}
