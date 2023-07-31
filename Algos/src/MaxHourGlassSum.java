public class MaxHourGlassSum {

    public static void main(String[] args) {

        System.out.println(hourglassSum(new int[][]{
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},
        }));
    }

    public static int hourglassSum(int[][] arr) {
        // start with a very small maximum
        int maxHourglassSum = Integer.MIN_VALUE;

        // iterate through the array
        // we subtract 2 because we need space for the hourglass shape (3x3)
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                // calculate the sum for the current hourglass
                int currentHourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // check if this hourglass has a larger sum
                if (currentHourglassSum > maxHourglassSum) {
                    maxHourglassSum = currentHourglassSum;
                }
            }
        }

        return maxHourglassSum;
    }
}
