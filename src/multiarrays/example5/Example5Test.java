package multiarrays.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example5Test {

    @Test
    void isSymmetric() {
        int[][] testInput = {
                {1, 0, 1},
                {2, 2, 0},
                {5, 2, 1}
        };

        boolean expected = Example5.isSymmetric(testInput);

        boolean result = true;

        assertEquals(expected, result);
    }
}