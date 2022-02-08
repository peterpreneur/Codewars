package NthSeries;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class NthSeriesBestTests1 {

	@Test
	public void test1() {
		assertEquals("1.57", NthSeriesBest1.seriesSum(5));
	}
	@Test
	public void test2() {
		assertEquals("1.77", NthSeriesBest1.seriesSum(9));
	}
	@Test
	public void test3() {
		assertEquals("1.94", NthSeriesBest1.seriesSum(15));
	}
	@Test
	public void test4() {
		assertEquals("2.26", NthSeriesBest1.seriesSum(39));
	}	
}
