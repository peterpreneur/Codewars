package stopgninnipSMysdroW;

import java.util.ArrayList;
import java.util.List;

public class SpinWords {

	public String spinWords(String sentence) {
		//public static void main(String[] args) {
		//String sentence = "Just kidding [there is still] one more";
		String newSentence = "";
		
		String words[] = sentence.split(" ");
		for (String token : words) {

			if (token.length() > 5) {
				// System.out.println(reverseWord(token));
				newSentence = newSentence + " " + reverseWord1(token);
			} else {
				// System.out.println(token);
				newSentence = newSentence + " " + token;
			}
		}
		//System.out.println(newSentence.trim());
		return newSentence.trim();
	}

	private static String reverseWord(String word) {
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString(); // reverse it
	}

	private static String reverseWord1(String word) {
		int strLength = word.length();
		char a[]=new char[strLength];
		char begChar = word.charAt(0);
		char endChar = word.charAt(strLength - 1);
		
		if (!((begChar >= 'a' && begChar <= 'z') || (begChar >= 'A' && begChar <= 'Z'))) 
		{
			return begChar + reverseWord(word.substring(1, strLength));
		} else if (!((endChar >= 'a' && endChar <= 'z') || (endChar >= 'A' && endChar <= 'Z')))
		{
			return reverseWord(word.substring(0, strLength-1)) + endChar;			
		} else {
			return reverseWord(word);						
		}		
	}
}
