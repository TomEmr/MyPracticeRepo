import java.util.Arrays;

public class DownwardRotate {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(downwardRotate(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9 ,10,11,12}
        }, 2)));

        System.out.println(Arrays.deepToString(downwardRotate(new int[][]{
                {1, 2, 3},
                {5, 6, 7},
                {9 ,10,11}
        }, 1)));
    }

    public static int[][] downwardRotate(int[][] matrix, int n) {

        int[] array = new int[matrix.length];
        int index = 0;

        for (int i = matrix.length - n; i < matrix.length; i++) {
           array[index] = matrix[i][n];
           index++;
        }
        for (int i = 0; i < matrix.length - n; i++) {
            array[index] = matrix[i][n];
            index++;
        }
        for (int i = 0; i < array.length; i++) {
            matrix[i][n] = array[i];
        }
        return matrix;
    }
}
//    Create a function called downwardRotate that receives a two dimensional array and a number n: downwardRotate(matrix, n). This function rotates elements in nth column downwards by n positions.
// Example 1:

// downwardRotate(
//     [
//         [1, 2, 3, 4],
//         [5, 6, 7, 8],
//         [9,10,11,12]
//     ],
//     2);

// This example should return

// [
//     [1, 2, 7,4],
//     [5, 6,11,8],
//     [9,10, 3,12]
// ]

// Example 2:

// downwardRotate(
//     [
//         [1, 2, 3],
//         [5, 6, 7],
//         [9,10,11]
//     ],
//     1);

// This example should return

// [
//         [1,10, 3],
//         [5, 2, 7],
//         [9, 6,11]
// ]
