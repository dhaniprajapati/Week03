package binarysearchtest;

import org.junit.jupiter.api.Test;

import static com.binarysearch.SearchValueIn2DMatrix.searchMatrix;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchValueIn2DMatrixTest {
    @Test
    void test1(){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {21, 31, 41, 51}
        };
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        assertTrue(result);
    }
    @Test
    void test2(){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {21, 31, 41, 51}
        };
        int target = 31;
        boolean result = searchMatrix(matrix, target);
        assertTrue(result);
    }
}
