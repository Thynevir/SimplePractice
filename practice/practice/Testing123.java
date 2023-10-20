package practice;

import java.util.*;
import java.util.stream.*;

public class Testing123 {

	public static List<String> lines = Arrays.asList("a", "b", "c");
	
	public static void main(String[] args) {

		System.out.print(number(lines));

	}
	
	public static List<String> number(List<String> lines) {
		
		ArrayList<String> result = new ArrayList();
		int i = 0;
		for(String s: lines) {
			
			result.add(++i + ": " + s);
		}
        return result;
        /*
         * static List<String> number(List<String> lines) {
    	if (lines.size() == 0) return lines;
    	return IntStream.range(0, lines.size())
            .mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
            .collect(Collectors.toList());
         */
    }

}
