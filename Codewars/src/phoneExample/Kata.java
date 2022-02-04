package phoneExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

	public static boolean validPhoneNumber(String s) {
		//public static void main(String[] args) {
		//String s = "(123) 456-7890";

		return (isValid(s));

		/*
		 * if (isValid(s)) // Print statement System.out.println("Valid Number"); else
		 * // Print statement System.out.println("Invalid Number");
		 */
	}

	private static boolean isValid(String s) {
        Pattern p = Pattern.compile(
        		"^"				//Finds a match as the beginning of a string as in: ^Hello
        		+ "("			//Open bracket
	        		+ "(\\(\\d{3}\\))"	//(312)
	        		+ "|"				//Find a match for any one of the patterns separated by | as in: cat|dog|fish
	        		+ "\\d{3}"			//312
        		+ ")"			//Close bracket
        		+ "[- .]?"		//either -, space or .
        		+ "\\d{3}"		//863
        		+ "[-]?"		//either -, space or .
        		+ "\\d{4}"		//9405
        		+ "$"			//Finds a match at the end of the string
        		);			
        
        Matcher m = p.matcher(s);
 
        return (m.matches());
	}
}
