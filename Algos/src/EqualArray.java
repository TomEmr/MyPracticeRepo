public class EqualArray {

    public static void main(String[] args) {

        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
    }
    public static int findEvenIndex(int[] arr) {
       int result = 0;
         for (int i = 0; i < arr.length; i++) {
              int leftSum = 0;
              int rightSum = 0;
              for (int j = 0; j < i; j++) {
                leftSum += arr[j];
              }
              for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
              }
              if (leftSum == rightSum) {
                result = i;
                break;
              } else {
                result = -1;
              }
         }
         return result;
    }
}
