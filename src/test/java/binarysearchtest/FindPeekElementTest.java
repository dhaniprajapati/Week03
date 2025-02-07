package binarysearchtest;

import com.binarysearch.FindPeekElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeekElementTest {
    @Test
    void testPeakElement(){
        int[] input= {11, 13, 29, 34, 77, 52};
        int expectedOutput=4;
        int actualOutput= FindPeekElement.findPeakElement(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void test2PeakElement(){
        int[] input= {13, 23, 99, 34, 56, 82};
        int expectedOutput=4;
        int actualOutput= FindPeekElement.findPeakElement(input);
        assertEquals(expectedOutput, actualOutput);
    }
}