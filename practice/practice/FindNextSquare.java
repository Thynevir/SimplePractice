package practice;

public class FindNextSquare {

	static long sq = 121;
	
	//find the next perfect square
	//return -1 if not given perfect square
	public static void main(String[] args) {
		
		System.out.print(findNextSquare());

	}
	
	public static long findNextSquare(){
		
		double root = Math.sqrt(sq); 
		// modulus 1 to check if square is perfect
		return root % 1 == 0 ? (long) Math.pow(root + 1, 2) : -1;
	}

}
