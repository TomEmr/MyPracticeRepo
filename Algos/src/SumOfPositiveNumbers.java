//You get an array of numbers, return the sum of all of the positives ones.
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//        Note: if there is nothing to sum, the sum is default to 0.

import java.util.Arrays;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        System.out.println(dummySolution(new int[]{1, -4, 7, 12}));
        System.out.println(coolStreamSolution(new int[]{1, -4, 7, 12}));
    }

//    int součet, iteruju celým array, pro každý int num se podívám, jestli je větší než nula a potom ho přičtu do sum
    public static int dummySolution(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
//bacha na import java.util.Arrays;
    public static int coolStreamSolution(int[] nums){
        return Arrays
                .stream(nums)
                .filter(num -> num > 0)
                .sum();
    }

}
