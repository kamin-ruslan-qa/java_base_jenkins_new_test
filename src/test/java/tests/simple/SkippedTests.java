package tests.simple;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SkippedTests {

    @Test
    void someTest() {
        assertTrue(false);
    }

    @Test
    void someTest1() {
        assertTrue(false);
    }
}