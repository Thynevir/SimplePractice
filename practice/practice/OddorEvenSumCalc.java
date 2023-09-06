package practice;
import static java.util.Arrays.stream;


public class OddorEvenSumCalc {
	//48
	static int[] array = {2, 5, 34, 6};
	static int sum = 0;
	
	public static void main(String[] args) {

		System.out.print(OddorEven());
	}
	
	public static String OddorEven(){
		/*
		
		for(int i : array) {
			
			sum += i;
		}
		return (array.length == 0 || array == null) ? "Empty" : (sum % 2 == 0) ? "Even": "Odd";
		*/
		return stream(array).sum() % 2 == 0 ? "Even" : "Odd";
	}
}
