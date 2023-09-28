package practice;

public class numberOfDivisors {

	static int num = 16;
	//5
	public static void main(String[] args) {
		
		System.out.print(numOfDivisors());
	}
	
	static public long numOfDivisors() {
		
		long count = 0;
		
		for(int i = 1;i<=num;i++) {
			
			if(num % i == 0) {
				
				count++;
			}
		}
		return count;
	}

}
