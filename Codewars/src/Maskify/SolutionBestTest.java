package Maskify;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionBestTest {
    @Test
    public void testSolution() {
        assertEquals("############5616", MaskifyBest.maskify("4556364607935616"));
        assertEquals("#######5616",      MaskifyBest.maskify(     "64607935616"));
        assertEquals("1",                MaskifyBest.maskify(               "1"));
        assertEquals("",                 MaskifyBest.maskify(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    MaskifyBest.maskify("Skippy")                                  );
        assertEquals("####################################man!",  MaskifyBest.maskify("Nananananananananananananananana Batman!"));
    }
}