package practice;

public class ComplementaryDNA {
	
	static String dna = "TAACG";

	public static void main(String[] args) {
		
		System.out.print(makeComplement());
	}
	
	public static String makeComplement() {
		char[] chars = dna.toCharArray();
		
		for(int i = 0; i < chars.length;i++) {
			
			chars[i] = getComplement(chars[i]);
		}
		return new String(chars);
	}
	
	public static char getComplement(char c) {
		
		switch (c) {
			case 'A': return 'T';
			case 'T': return 'A';
			case 'C': return 'G';
			case 'G': return 'C';
		}
		return c;
		// return dna.replaceAll("A","t").replaceAll("T","a").replaceAll("C","g").replaceAll("G","c").toUpperCase();
	}

}
