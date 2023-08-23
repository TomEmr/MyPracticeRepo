import java.util.Arrays;

public class ArraySumOfDifferences {

//    zadani
//    Your task is to sum the differences between consecutive pairs in the array in descending order.
//    Example
//[2, 1, 10]  -->  9
//    In descending order: [10, 2, 1]
//    Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
//    If the array is empty or the array has only one element the result should be 0


    public static void main(String[] args) {
        System.out.println(dummySolution(new int[]{2, 1, 10}));
        System.out.println(sum(new int[]{2, 1, 10}));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        if (arr.length < 2) {
            return sum;
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }
        return sum;
    }

//    podmínka na prázdnou array vrací nulu
//    seřadím array ale od nejmenšího po největší, takže potom iteruji odzadu a sčítám rozdíly
//    bacha na import java.util.Arrays;
    public static int dummySolution(int[] arr) {
        int sum = 0;
        if (arr.length == 0 || arr.length == 1) {
            return sum;
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i-1];
        }
        return sum;
    }
}
