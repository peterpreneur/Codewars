package NthSeries;

import java.text.DecimalFormat;

public class NthSeries {
	public static String seriesSum(int n) {
	//public static void main(String args[]) {

		//int n = 39;
		int div = 1;
		double sum = 0.00d;

		for (int i = 1; i <= n; i++) {
				//System.out.println(i);
				//System.out.println(div);
			sum = withMathRound((sum + (1.00 / div)), 4);
				//System.out.println(sum);
				//System.out.println(String.format("%.2f", sum));
				//System.out.println(sum);
			div = div + 3;
		}
		//System.out.println(withMathRound(sum,2));
		//System.out.println(String.format("%.2f", sum));
		String str = new DecimalFormat("#.0#").format(sum); 

	    return str;		
		//return withMathRound(sum , 2) + "";
	}
	
	public static double withMathRound(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}	
}
