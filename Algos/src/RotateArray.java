public class RotateArray {

    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            result[index++] = nums[i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            result[index++] = nums[i];
        }
        return result;
    }
}
