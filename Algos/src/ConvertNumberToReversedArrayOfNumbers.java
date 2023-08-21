//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//        Example(Input => Output):
//        35231 => [1,3,2,5,3]
//        0 => [0]

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dummySolution(35231)));
        System.out.println(Arrays.toString(dummySolution2(35231)));
        System.out.println(Arrays.toString(coolStringBuilderSolution(35231)));
    }
//    1. převedu číslo na string
//    2. vytvořím si array o délce stringu
//    3. iteruji přes string a převádím znaky na čísla a ukládám do array
//    4. vracím array
    public static int[] dummySolution(int n) {
        String number = String.valueOf(n);
        int[] result = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(number.charAt(number.length() - 1 - i)));
        }
        return result;
    }

    public static int[] dummySolution2(int n) {
        String number = String.valueOf(n);
        String[] split = number.split("");
        int[] result = new int[number.length()];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[split.length - 1 - i]);
        }
        return result;
    }

    public static int[] coolStringBuilderSolution(int n){
        return new StringBuilder()
                .append(n)
                .reverse()
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
