package multiarrays.example1;

import java.util.Arrays;

public class Example1 {


    public static int[][] matrixAddition(int[][] input1, int[][] input2) {
        if (input1.length!= input2.length){
            throw new RuntimeException("Invalid input");
        }
        int[][] sum = new int[input1.length][input2.length];
        for (int row = 0; row < input1.length; row++) {
            for (int column = 0; column < input1[row].length; column++) {
                sum[row][column] = input1[row][column] + input2[row][column];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};

        System.out.println(Arrays.deepToString(matrixAddition(mat, mat2)));

    }
}
