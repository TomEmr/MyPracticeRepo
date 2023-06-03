package multiarrays.example6;

public class Example6 {

    public static int sumOddRows(int[][] matrix) {

        int sum = 0;
        for (int row = 1; row < matrix.length; row += 2) {
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] input = {{1, 2}, {3, 4}, {5, 6}, {100, 10}};

        System.out.println(sumOddRows(input));
    }
}
