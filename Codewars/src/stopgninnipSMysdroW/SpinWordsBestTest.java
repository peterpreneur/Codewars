package stopgninnipSMysdroW;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsBestTest {
	@Test
	public void test() {
		assertEquals("emocleW", new SpinWordsBest().spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", new SpinWordsBest().spinWords("Hey fellow warriors"));
		assertEquals("Just gniddik ereht[ is ]llits one more", new SpinWordsBest().spinWords("Just kidding [there is still] one more"));
	}

}
