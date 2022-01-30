package stopgninnipSMysdroW;

public class SpinWords {

	public static void main(String[] args) {
		// public String spinWords(String sentence) {
		String sentence = "Dot saw I was Tod";
		String words[] = sentence.split(" ");
		for (String token : words) {
			if (token.length() > 5) {
			String word = token;			
			}
			
			String test= spinWordGtFive(sentence);

		}
		// return spinWordGtFive(sentence);
	}

	private String spinWordGtFive(String word) {
		StringBuilder sb = new StringBuilder(word);

		String reverseWord = sb.reverse().toString(); // reverse it

		return reverseWord;
	}
}
