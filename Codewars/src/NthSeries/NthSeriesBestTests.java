package NthSeries;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class NthSeriesBestTests {

	@Test
	public void test1() {
		assertEquals("1.57", NthSeriesBest.seriesSum(5));
	}
	@Test
	public void test2() {
		assertEquals("1.77", NthSeriesBest.seriesSum(9));
	}
	@Test
	public void test3() {
		assertEquals("1.94", NthSeriesBest.seriesSum(15));
	}
	@Test
	public void test4() {
		assertEquals("2.26", NthSeriesBest.seriesSum(39));
	}	
}
