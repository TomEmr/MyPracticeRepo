import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = k; i < nums.length; i++) {
            result[index++] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            result[index++] = nums[i];
        }
        return result;
    }

//    public static List<Integer> rotLeft(List<Integer> a, int d) {
//        // Write your code here
//        List<Integer> res = new ArrayList<>();
//        for (int i = d; i < a.size(); i++) {
//            res.add(a.get(i));
//        }
//        for (int i = 0; i < d; i++) {
//            res.add(a.get(i));
//        }
//        return res;
//    }
}
