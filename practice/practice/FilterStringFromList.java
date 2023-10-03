package practice;

import java.util.*;
import java.util.stream.*;

public class FilterStringFromList {

	static List<Object> list = Arrays.asList(1, 2, "aasf", "1", "123", 123);
	
	public static void main(String[] args) {
		
		System.out.print(filterList());

	}

	public static List<Object> filterList() {
	    // Return the List with the Strings filtered out
		
	    return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());
 }
}
