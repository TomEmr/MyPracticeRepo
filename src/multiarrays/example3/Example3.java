package multiarrays.example3;

import java.util.Arrays;

public class Example3 {

    public static int[][] sumRowsAndColumns(int[][] matrix) {

        int[][] result = new int[2][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int column = 0; column < matrix.length; column++) {
                rowSum += matrix[row][column];
            }
            result[0][row] = rowSum;
        }
        for (int column = 0; column < matrix.length; column++) {
            int columnSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                columnSum += matrix[row][column];
            }
            result[1][column] = columnSum;
        }
        return result;
    }
}
