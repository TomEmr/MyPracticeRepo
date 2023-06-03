package multiarrays.example5;

public class Example5 {

    public static boolean isSymmetric(int[][] matrix) {
        if (matrix == null){
            return false;
        }

        if (matrix.length == 0){
            return true;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[matrix.length - j - 1][matrix[i].length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
