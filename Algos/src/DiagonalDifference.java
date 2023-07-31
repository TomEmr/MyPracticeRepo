public class DiagonalDifference {

    public static void main(String[] args) {

        System.out.println(diagonalDifference(new int[][]{
                {11, 2, 4,},
                {4, 5, 6,},
                {10, 8, -12,},
        }));
    }

    public static int diagonalDifference(int[][] arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            leftToRight += arr[i][i];
            rightToLeft += arr[i][arr.length - 1 - i];
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}


//    Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//        For example, the square matrix  is shown below:
//
//        1 2 3
//        4 5 6
//        9 8 9
//        The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
//
//        Function description
//
//        Complete the  function in the editor below.
//
//        diagonalDifference takes the following parameter:
//
//        int arr[n][m]: an array of integers
//        Return
//
//        int: the absolute diagonal difference
