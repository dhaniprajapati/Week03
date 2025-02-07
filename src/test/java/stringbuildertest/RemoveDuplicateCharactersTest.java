package stringbuildertest;

import com.stringbuilder.RemoveDuplicateCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateCharactersTest {
    @Test
    void test1(){
        String input= "congratulations";
        String expectedOutput= "congratulis";
        String remove= RemoveDuplicateCharacters.removeDuplicates(input);
        assertEquals(expectedOutput,remove);
    }
    @Test
    void test2(){
        String input= "helloween";
        String expectedOutput= "helown";
        String remove= RemoveDuplicateCharacters.removeDuplicates(input);
        assertEquals(expectedOutput,remove);
    }
    @Test
    void test3(){
        String input= "example";
        String expectedOutput= "example";
        String remove= RemoveDuplicateCharacters.removeDuplicates(input);
        assertEquals(expectedOutput,remove);
    }
}
