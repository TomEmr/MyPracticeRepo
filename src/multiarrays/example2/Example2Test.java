package multiarrays.example2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {

    @Test
    @DisplayName("Test with 2x3 array")
    void transposeFirstTest() {
//        arrange
        int[][] input = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected = {{1, 3, 5}, {2, 4, 6}};
//        act+assert
        assertArrayEquals(expected, Example2.transpose(input));
    }

}