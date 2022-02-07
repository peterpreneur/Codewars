package Maskify;

public class Maskify {
	public static String maskify(String str) {
		// public static void main(String[] args) {
		// throw new UnsupportedOperationException("Unimplemented");

		return str.replaceAll(".(?=.{4})", "#");
	}

}
