import java.util.Arrays;
public class ClosestDistance {

    public static void main(String[] args) {
        System.out.println(closestDistance(new int[]{1, 5, 61, 63}));
        System.out.println(close(new int[]{1, 5, 61, 63}));
        System.out.println(closestDistance(new int[]{1, 5, 61, 93, 100}));
    }

    public static int close(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i -1] - arr[i]);
            if (diff < min){
                min = diff;
            }
        }
        return min;
    }
    public static int closestDistance(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
