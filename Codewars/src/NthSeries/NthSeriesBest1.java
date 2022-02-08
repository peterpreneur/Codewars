package NthSeries;

import java.util.stream.IntStream;

public class NthSeriesBest1 {
  
  public static String seriesSum(int n) {
        return String.format("%.2f", 
        		IntStream.range(0, n)
        				.mapToDouble(num -> 1.0 / (1 + num * 3))
        				.sum());
    }
}

