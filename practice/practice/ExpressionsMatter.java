package practice;

public class ExpressionsMatter {

	static int a = 9;
	static int b = 7;
	static int c = 2;
	
	public static void main(String[] args) {
		//Given three integers a ,b ,c, return the largest number obtained after inserting the 
		//following operators and brackets: +, *, ()
		
		//Notes:

	    /*
	    *The numbers are always positive.
	    *The numbers are in the range (1  ≤  a, b, c  ≤  10).
	    *You can use the same operation more than once.
	    *It's not necessary to place all the signs and brackets.
	    *Repetition in numbers may occur .
	    *You cannot swap the operands. For instance, in the given example you 
		*cannot get expression (1 + 3) * 2 = 8.
		*/
		System.out.print(expressionsMatter());
	}
	
	static public int expressionsMatter() {
		
		  int max1 = 0;
	      int max2 = 0;
	      int max3 = 0;
	      int max4 = 0;
	      
	      max1 = (a+b)*c;
	      max2 = a*(b+c);
	      max3 = a+b+c;
	      max4 = a*b*c;
	      
	      if(max1 >= max2 && max1 >= max3 && max1 >= max4){
	        
	        return max1;
	      } else if(max2 >= max1 && max2 >= max3 && max2 >= max4){
	        
	        return max2;
	      } else if(max3 >= max1 && max3 >= max2 && max3 >= max4){
	        
	        return max3;
	      }else 
	    	  return max4;
	      //possible with just a single line:
	      //return Math.max(Math.max(a+b+c, a*b*c),Math.max((a+b)*c, a*(b+c)))
	}

}
