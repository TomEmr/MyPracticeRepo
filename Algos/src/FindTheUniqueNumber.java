import java.util.*;

public class FindTheUniqueNumber {

    public static void main(String[] args) {

        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(find(new double[]{0, 0, 0.55, 0, 0}));
    }

    public static double find(double[] arr) {
        Arrays.sort(arr);
        return arr[0] != arr[1] ? arr[0] : arr[arr.length - 1];
    }

    public static double findUniq(double[] arr) {
        // Do the magic
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length - 1];
        } else {
            return arr[0];
        }
    }
}


//    There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//        It’s guaranteed that array contains at least 3 numbers.
//
//        The tests contain some very huge arrays, so think about performance.

