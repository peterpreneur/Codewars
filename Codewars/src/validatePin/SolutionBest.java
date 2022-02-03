package validatePin;

public class SolutionBest {

	public static boolean validatePin(String pin) {
		return pin.matches("\\d{4}|\\d{6}");
	}
}