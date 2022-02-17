package removeDuplicate;

public class removeDuplicate {
	public static String removeConsecutiveDuplicates(String s) {
		String newString[] = s.split(" ");
		String answer = newString[0];
		String currWord = newString[0];

		for (String word : newString) {
			if (!word.equals(currWord)) {
				answer = answer.concat(" " + word);
			}
			currWord = word;
		}
		return answer;
	}
}
