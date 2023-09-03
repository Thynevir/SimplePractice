package practice;

public class FizzBuzz {
	static int num = 9;
	
		public static void main(String[] args) {
			
			System.out.println(FizzBuzzCalc());
		}
		public static String FizzBuzzCalc() {
			// Return "Fizz" if a number num is divisible by 3, "Buzz" if divisible by 5
			//, and "FizzBuzz" if divisible by both.
			// solvable with ternary operator or if/else
		/*	if(num%3 == 0 && num%5 == 0) {
				
				return "FizzBuzz";
			} else if(num%3 == 0) {
				
				return "Fizz";
			} else if (num%5 == 0){
				
				return "Buzz";
			}
			return "Neither";
		*/
			//ternary operator version
			return (num%3 == 0 && num%5 == 0)? "FizzBuzz" :(num%3 == 0) ? "Fizz" : (num%5 == 0)? "Buzz" : "Neither";
		}

}
