package multiarrays.example2;

import java.util.Arrays;

public class Example2 {

    public static int[][] transpose(int[][] matrix) {

//        method to check if there is the same number of rows and colums
        for (int i = 1; i < matrix.length; i++){
            if (matrix[i].length != matrix[0].length){
                throw new IllegalArgumentException("Irregular matrix");
            }
        }
//      pro tu otočenou matrix musím prohodit column a row kdyby náhodou nebyla např 3x3 ale třeba 2x3!!!!!!!!!
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] firstMat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] failMat = {{1, 2}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(transpose(firstMat)));
        System.out.println(Arrays.deepToString(transpose(failMat)));
    }
}
