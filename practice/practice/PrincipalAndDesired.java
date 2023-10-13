package practice;

public class PrincipalAndDesired {
	
	static double principal = 1000;
	static double interestRate = 0.05;
	static double taxRate = 0.18;
	static double desired = 1100;

	public static void main(String[] args) {
		
		System.out.print(calculateYears());

	}

	public static int calculateYears() {
		   /*  Principal * interest rate = interest 
		    *  interest * tax rate = tax 
		    *  Principal + interest - tax = investment
		    *  return investment return is next year's principal
		    */
		int years = 0;
		if(principal == desired){
		      
		      return 0;
		     }
		
		while (principal < desired) {
			principal += principal * interestRate * (1-taxRate);
			years++;
		}
		
		
		return years;
	}
}
