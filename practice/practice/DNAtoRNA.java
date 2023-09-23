package practice;

public class DNAtoRNA {

	static String dna = "GCAT";
	//TTTT

	public static void main(String[] args) {
		// 
		
		System.out.print(dnaToRna());

	}
	public static String dnaToRna() {
		String rna = "";
	      
	      if(!dna.contains("T")){
	        
	        return dna;
	      }
	      else if(dna.contains("T")){
	        
	        rna = dna.replaceAll("T", "U");
	      }
	      
	      return rna;
	      //can be done in a single line: 
	      //return dna.replace("T", "U");
	    } 
	}
