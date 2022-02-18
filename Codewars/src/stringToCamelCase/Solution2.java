package stringToCamelCase;

import java.util.Arrays;

public class Solution2 {

	static String toCamelCase(String str) {
		//public static void main (String[] args) {
		//String str = "_the_stealth_warrior";
		
		String[] words = str.split("[-_]");

		return Arrays.stream(words, 1, words.length)		
				.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
				.reduce(words[0], String::concat);	
				
	}
}
