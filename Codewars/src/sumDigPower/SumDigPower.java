package sumDigPower;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

	//public static void main(String[] args) { 
	//	long a = 1; 
	//	long b = 100;
	public static List<Long> sumDigPow(long a, long b) {
		List<Long> sumDP = new ArrayList<>();
		for (long i = a; i <= b; i++) {
			long numDigits = countDigit(i);
			long eurekaTotal = 0;
			for (long j = 1; j <= countDigit(i); j++) {
				int digits = (getNthDigit(i, 10, numDigits));
				eurekaTotal = eurekaTotal + (long) Math.pow(digits, j);
				numDigits--;
			}
			if (i == eurekaTotal) {
				sumDP.add(i);
			}
		}
		//System.out.println(sumDP.toString());
		return sumDP;
	}

	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	static public int getNthDigit(long i, int base, long j) {
		return (int) ((i / Math.pow(base, j - 1)) % base);
	}
}
