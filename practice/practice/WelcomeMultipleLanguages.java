package practice;

public class WelcomeMultipleLanguages {

	static String Language = "danish";
	
	public static void main(String[] args) {
		
		System.out.print(Welcome(Language));
		
	}
	
	public static String Welcome(String Language) {
		
		switch(Language){
			case "english":
				return "Welcome";
			
			case "czech":
				return "Vitejte";
				
			case "danish":
				return "Velkomst";
				
			case "dutch":
				return "Welkom";
				
			case "estonian":
				return "Tere tulemast";
			
			case "finnish":
				return "Tervetuloa";
				
			case "flemish":
				return "Welgekomen";
				
			case "french":
				return "Bienvenue";
				
			case "german":
				return "Willkommen";
				
			case "irish":
				return "Failte";
				
			case "italian":
				return "Benvenuto";
				
			case "latvian":
				return "Gaidits";
				
			case "lithuanian":
				return "Laukiamas";
				
			case "polish":
				return "Witamy";
				
			case "spanish":
				return "Bienvenido";
			
			case "swedish":
				return "Valkommen";
			
			case "welsh":
				return "Croeso";
		}
		/* Hashmap Solution
		 * HashMap<String, String> greeting = new HashMap<>();
		 * greeting.put("english", "Welcome");
         * greeting.put("czech", "Vitejte");
		 * etc
		 * if (greeting.containsKey(language)){
		 * return greeting.get(language);
		 * }
		 * return greeting.get("english");
		 */
		return "Welcome";
	}

}
