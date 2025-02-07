package stringbuffertest;

import com.stringbuffer.ConcatenateStrings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConcatenateStringsTest {
    @Test
    void test1() {
        String[] input = {"Welcome ", "to ", "the ", "hub ", "of ", "innovation."};
        String expectedOutput = "Welcome to the hub of innovation.";
        String concatenated = ConcatenateStrings.concatenateStrings(input);
        assertEquals(expectedOutput, concatenated);
    }
    @Test
    void test2() {
        String[] input = {"Welcome", "to", "the ", "hub ", "of ", "innovation."};
        String expectedOutput = "Welcometothehubofinnovation.";
        String concatenated = ConcatenateStrings.concatenateStrings(input);
        assertEquals(expectedOutput, concatenated);
    }
    @Test
    void test3() {
        String[] input = {"Welcome", "to", "the", "hub", "of", "innovation."};
        String expectedOutput = "Welcometothehubofinnovation.";
        String concatenated = ConcatenateStrings.concatenateStrings(input);
        assertEquals(expectedOutput, concatenated);
    }
}
