package practice;

public class Factorial {

	public static int n = 5;
	
	public static void main(String[] args) {
		
		System.out.print(factorial(n));

	}

	public static int factorial(int n) throws IllegalArgumentException{
	    int result = 1;
	    
		if(n<0 || n>12){
		      
		      throw new IllegalArgumentException();
		    }
		
		for(int i = 2; i<=n ; i++) {
			
			result *= i;
		}
		
	    return result;
	  }
}
