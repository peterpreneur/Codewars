package stringToCamelCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
	static String toCamelCase(String s) {
		//public static void main(String[] args) {
		// public static Pattern compile(String regex)
		//String s = "the_stealth_warrior";
		//System.out.println(s);
		
		String regexEx = "[_|-](\\w)";
		Pattern pattern = Pattern.compile(regexEx);
		//System.out.println(pattern);

		Matcher m = pattern.matcher(s);
		
		StringBuffer sb = new StringBuffer();
		//System.out.println(sb);	
		while (m.find()) {
			m.appendReplacement(sb, m.group(1).toUpperCase());
			//System.out.println(m.toString());	
			//System.out.println(sb);	
		}
		//System.out.println(m.appendTail(sb).toString());
		return m.appendTail(sb).toString();
	}
}
