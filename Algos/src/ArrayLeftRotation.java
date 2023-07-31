import java.util.Arrays;

public class ArrayLeftRotation {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int d = 4;
        System.out.println(Arrays.toString(rotLeft(a, d)));
    }

    public static int[] rotLeft(int[] a, int d) {
//        výsledná array má stejnou délku jako vstupní
        int[] result = new int[a.length];
//        procházím vstupní array
        for (int i = 0; i < a.length; i++) {
//            nový index je i - d
            int newIndex = i - d;
//            pokud je nový index menší než 0, přičtu k němu délku vstupní array
            if (newIndex < 0) {
                newIndex += a.length;
            }
//            výsledná array na novém indexu je hodnota z vstupní array na indexu i
            result[newIndex] = a[i];
        }
        return result;
    }
}

//    A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
//
//        Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
//
//        Function Description
//
//        Complete the function rotLeft in the editor below.
//
//        rotLeft has the following parameter(s):
//
//        int a[n]: the array to rotate
//        int d: the number of rotations
//        Returns
//
//        int a'[n]: the rotated array

