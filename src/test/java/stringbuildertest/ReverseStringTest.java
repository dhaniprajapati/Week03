package stringbuildertest;

import static org.junit.jupiter.api.Assertions.*;

import com.stringbuilder.ReverseString;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void test1(){
        String input= "hello";
        String expectedOutput = "olleh";
        String reverse = ReverseString.reverseString(input);
        assertEquals(expectedOutput,reverse);
    }
    @Test
    void test2(){
        String input= "hell";
        String expectedOutput = "olleh";
        String reverse = ReverseString.reverseString(input);
        assertEquals(expectedOutput,reverse);
    }
    @Test
    void test3(){
        String input= "hello";
        String expectedOutput = "olelh";
        String reverse = ReverseString.reverseString(input);
        assertEquals(expectedOutput,reverse);
    }
}
