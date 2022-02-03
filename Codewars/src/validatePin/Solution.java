package validatePin;

public class Solution {
	
	public static boolean validatePin(String pin) {
	// public static void main(String[] args) {
	// String pin = "123456";
		if ((pin.length() == 4) || (pin.length() == 6)) {
			String text = "\\d+";

			if (pin.matches(text.repeat(pin.length()))) {
				// System.out.print(pin.length() + " true");
				return true;
			} else {
				// System.out.print(pin.length() + " false");
				return false;
			}
		}
		return false;
	}
}