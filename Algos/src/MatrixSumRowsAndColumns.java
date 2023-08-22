import java.util.Arrays;

public class MatrixSumRowsAndColumns {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sumRowsAndColumns(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        })));
    }

    public static int[][] sumRowsAndColumns(int[][] matrix) {
        int[][] result = new int[2][matrix.length];
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            for (int j = 0; j < columns; j++ ) {
                sumRow += matrix[i][j];
            }
            result[0][i] = sumRow;
        }
        for (int i = 0; i < columns; i++) {
            int sumColumn = 0;
            for (int j = 0; j < rows; j++) {
                sumColumn += matrix[j][i];
            }
            result[1][i] = sumColumn;
        }
        return result;
    }
}
