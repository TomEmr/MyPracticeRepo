package multiarrays.example3;

import multiarrays.example1.Example1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example3Test {

    @Test
    @DisplayName("First test")
    void testMethodWithGivenNumbers(){

        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{6, 15, 24}, {12, 15, 18}};

        int[][] result = Example3.sumRowsAndColumns(input);

        assertArrayEquals(expected, result);

    }

}