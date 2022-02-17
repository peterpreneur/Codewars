package stringToCamelCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
	static String toCamelCase(String s) {
		Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
		
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, m.group(1).toUpperCase());
		}
		return m.appendTail(sb).toString();
	}
}
