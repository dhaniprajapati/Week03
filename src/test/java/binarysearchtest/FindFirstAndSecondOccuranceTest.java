package binarysearchtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.binarysearch.FirstAndSecondOccurance.findFirstOccurrence;
import static com.binarysearch.FirstAndSecondOccurance.findLastOccurrence;

public class FindFirstAndSecondOccuranceTest {
    @Test
    void testFirstAndSecondOccurance(){
        int[] input= {11, 13, 29, 34, 77, 52};
        int target= 13;
        int expectedOutput=1;
        int firstOccurrence = findFirstOccurrence(input, target);
        int lastOccurrence = findLastOccurrence(input, target);
        assertEquals(expectedOutput,firstOccurrence);
        assertEquals(expectedOutput,lastOccurrence);
    }
    @Test
    void test2FirstAndSecondOccurance(){
        int[] input= {11, 13, 29, 34, 77, 52};
        int target= 77;
        int expectedOutput=4;
        int firstOccurrence = findFirstOccurrence(input, target);
        int lastOccurrence = findLastOccurrence(input, target);
        assertEquals(expectedOutput,firstOccurrence);
        assertEquals(expectedOutput,lastOccurrence);
    }
    @Test
    void test3FirstAndSecondOccurance(){
        int[] input= {11, 13, 29, 34, 77, 52};
        int target= 23;
        int expectedOutput=1;
        int firstOccurrence = findFirstOccurrence(input, target);
        int lastOccurrence = findLastOccurrence(input, target);
        assertEquals(expectedOutput,firstOccurrence);
        assertEquals(expectedOutput,lastOccurrence);
    }
}
