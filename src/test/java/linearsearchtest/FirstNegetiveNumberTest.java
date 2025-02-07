package linearsearchtest;

import com.linearsearch.FirstNegetiveNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNegetiveNumberTest {
    @Test
    void testFirstNegetiveNumber(){
        int[] input= {0, 5, 8, 1, -2, 4, -9};
        int expected= 4;
        int actual= FirstNegetiveNumber.findFirstNegative(input);
        assertEquals(expected,actual);
    }
    @Test
    void test1FirstNegetiveNumber(){
        int[] input= {0, 5, 8, 1, 2, 4, -9};
        int expected= 4;
        int actual= FirstNegetiveNumber.findFirstNegative(input);
        assertEquals(expected,actual);
    }
    @Test
    void test2FirstNegetiveNumber(){
        int[] input= {0, 5, -8, 1, -2, 4, -9};
        int expected= 2;
        int actual= FirstNegetiveNumber.findFirstNegative(input);
        assertEquals(expected,actual);
    }
}
