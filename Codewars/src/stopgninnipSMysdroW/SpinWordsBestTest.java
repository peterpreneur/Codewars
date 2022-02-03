package stopgninnipSMysdroW;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsBestTest {
	@Test
	public void test() {
		assertEquals("emocleW", new SpinWordsBest().spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", new SpinWordsBest().spinWords("Hey fellow warriors"));
	}

}
