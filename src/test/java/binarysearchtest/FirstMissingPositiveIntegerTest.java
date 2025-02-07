package binarysearchtest;

import com.binarysearch.FirstMissingPositiveInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstMissingPositiveIntegerTest {
    @Test
    void testFirstMissingPositiveInteger(){
        int[] input= {-1, 3, 4, 5, 6};
        int expectedOutput=1;
        int firstMissingPositive = FirstMissingPositiveInteger.findFirstMissingPositive(input);
        assertEquals(expectedOutput,firstMissingPositive);
    }
    @Test
    void binarySearchTest(){
        int[] input= {-1, 3, 4, 5, 6};
        int target= 3;
        int expectedOutput=1;
        int binarySearchTest= FirstMissingPositiveInteger.binarySearch(input,target);
        assertEquals(expectedOutput,binarySearchTest);
    }
}
