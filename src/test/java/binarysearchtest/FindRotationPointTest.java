package binarysearchtest;

import com.binarysearch.FindRotationPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindRotationPointTest {
    @Test
    void testRotationPointIndex(){
        int[] input= {6, 7, 8, 9, 0, 1, 2, 3, 4};
        int expecteOutput= 4;
        int actualOutput= FindRotationPoint.findRotationPoint(input);
        assertEquals(expecteOutput, actualOutput);
    }
    @Test
    void test2(){
        int[] input= {14, 15, 16, 17, 10, 11, 12, 13};
        int expecteOutput= 4;
        int actualOutput= FindRotationPoint.findRotationPoint(input);
        assertEquals(expecteOutput, actualOutput);
    }
    @Test
    void test3(){
        int[] input= {1, 3, 5, 7, 0, 1, 3, 5};
        int expecteOutput= 1;
        int actualOutput= FindRotationPoint.findRotationPoint(input);
        assertEquals(expecteOutput, actualOutput);
    }
}
