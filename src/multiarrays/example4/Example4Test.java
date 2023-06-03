package multiarrays.example4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Example4Test {

    @Test
    @DisplayName("First test to pass")
    void shorterStringsMatrix(){
        String[][] matrix1 = {{"apple", "banana", "orange"}, {"cat", "dog", "elephant"}, {"red", "green", "blue"}};
        String[][] matrix2 = {{"app", "pear", "grape"}, {"rabbit", "fox", "lion"}, {"purple", "pink", "yellow"}};
        String[][] expected = {{"app", "pear", "grape"}, {"cat", "dog", "lion"}, {"red", "pink", "blue"}};
        String[][] result = Example4.shorterStringsMatrix(matrix1, matrix2);
        assert Arrays.deepEquals(result, expected);

    }

}