package linearsearchtest;

import com.linearsearch.SpecificWordSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpecificWordSearchTest {
    @Test
    void testSpecificWord(){
        String[] sentences = {
                "A cow is a domestic animal.",
                "Cows are one of the most innocent animals who are very harmless.",
                "People keep cows at their homes for various benefits.",
                "Cows are four-footed and have a large body.",
        };
        String wordToFind = "cow";
        String expectedSentence = "A cow is a domestic animal.";
        String result = SpecificWordSearch.findSentenceWithWord(sentences, wordToFind);
        assertEquals(expectedSentence,result);
    }
    @Test
    void test1SpecificWord(){
        String[] sentences = {
                "A cow is a domestic animal.",
                "Cows are one of the most innocent animals who are very harmless.",
                "People keep cows at their homes for various benefits.",
                "Cows are four-footed and have a large body.",
        };
        String wordToFind = "large";
        String expectedSentence = "Cows are four-footed and have a large body.";
        String result = SpecificWordSearch.findSentenceWithWord(sentences, wordToFind);
        assertEquals(expectedSentence,result);
    }

}
