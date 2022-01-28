package givemeadiamond;

class Diamond {
	public static String print(int n) {
		// public static void main(String[] args) {
		if (n % 2 == 0 || n < 0) {
			return null;
		} else {
			// int n = 3;
			String ast = "*";
			String blank = " ";
			String diamond = "";

			int i;
			int j = n / 2;

			for (i = 0; i < n; i++) {
				if (i % 2 > 0) {
					// System.out.println(blank.repeat(j) + ast.repeat(i) + "\\n" + " " + i + " " +
					// j + " odd");
					diamond = diamond + blank.repeat(j) + ast.repeat(i) + "\n";
					j--;
				}
			}

			j = 0;
			for (i = n; i > 0; i--) {
				if (i % 2 > 0) {
					// System.out.println(blank.repeat(j) + ast.repeat(i) + "\\n" + " " + i + "--" +
					// j + " odd ");
					diamond = diamond + blank.repeat(j) + ast.repeat(i) + "\n";
					j++;
				}
			}

			// System.out.println(diamond);
			return diamond;
		}
	}


}