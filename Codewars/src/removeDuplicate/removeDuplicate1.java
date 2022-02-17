package removeDuplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate1 {
	public static String removeConsecutiveDuplicates(String s) {
		String[] palabraSplited = s.split(" ");
		ArrayList<String> palabra = new ArrayList<>(Arrays.asList(palabraSplited));

		int i = 0;
		while (i < palabra.size() - 1) {
			if (!palabra.get(i).equals(palabra.get(i + 1))) {
				i++;
			} else {
				palabra.remove(i);
			}
		}

		String resultado = String.join(" ", palabra);
		return resultado;
	}
}