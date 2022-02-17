package stringToCamelCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest1 {
	@Test
	public void testSomeUnderscoreLowerStart() {
		String input = "the_Stealth_Warrior";
		System.out.println("input: " + input);
		assertEquals("theStealthWarrior", Solution1.toCamelCase(input));
	}

	@Test
	public void testSomeDashLowerStart() {
		String input = "the-Stealth-Warrior";
		System.out.println("input: " + input);
		assertEquals("theStealthWarrior", Solution1.toCamelCase(input));
	}
}