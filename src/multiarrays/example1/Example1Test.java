package multiarrays.example1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    @DisplayName("Test with 3x3 matrix")
    void testWith3x3Matrix() {
//        arrange
        int[][] firstMat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMat = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] expected = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
//        act
        int[][] result = Example1.matrixAddition(firstMat, secondMat);
//        assert
        assertArrayEquals(expected, result);
    }
}