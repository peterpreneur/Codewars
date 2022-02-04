package phoneExample;

import java.util.regex.Pattern;

public class KataBest {

	public static boolean validPhoneNumber(String phoneNumber) {
		return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
	}
}