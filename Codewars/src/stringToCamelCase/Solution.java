package stringToCamelCase;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

	static String toCamelCase(String s) {
		char[] tempS = new char[s.length()];
		int len = s.length();
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '_' || s.charAt(i) == '-') {
				i++;
				tempS[index] = Character.toUpperCase(s.charAt(i));
			} else {
				tempS[index] = s.charAt(i);				
			};
			index++;
		}

		String newStr = "";
		for (int j = 0; j < tempS.length; j++) {
			newStr = newStr + tempS[j];
		}
		System.out.println(newStr.trim());

		return newStr.trim();
	}
}