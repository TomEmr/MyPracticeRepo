import java.util.Arrays;

public class MatrixTranspose {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }

    public static int[][] transpose(int[][] matrix) {
//        int matrix[][] = { { 2, 5, 3, 8 }, { 12, 66, 6, 4 }, { 1, 16, 42, 9 } };
//        tenhle příklad ukazuje že matrix[0].length je počet sloupců = 4 a matrix.length je počet řádků = 3 v původní matrix
//        do výsledné to musím přehodit!!! takže výsledná matrix bude mít 4 řádky a 3 sloupce
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

//    Write a function that outputs the transpose of a matrix - a new matrix where the columns and rows of the original are swapped.
//
//        For example, the transpose of:
//
//        | 1 2 3 |
//        | 4 5 6 |
//        is
//
//        | 1 4 |
//        | 2 5 |
//        | 3 6 |
//        The input to your function will be an array of matrix rows. You can assume that each row has the same length, and that the height and width of the matrix are both positive.
//