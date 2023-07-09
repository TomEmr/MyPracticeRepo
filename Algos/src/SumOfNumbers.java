//Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.
//        Note: a and b are not ordered!

import java.util.stream.IntStream;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(dummySolution(1, 5));
        System.out.println(dummySolution(5, 1));
        System.out.println(dummySolution(1, 1));
        System.out.println(dummySolution(-1, 0));
        System.out.println(dummySolution(-1, 2));
        System.out.println("-----");
        System.out.println(switchSolution(1, 5));
        System.out.println(switchSolution(5, 1));
        System.out.println(switchSolution(1, 1));
        System.out.println(switchSolution(-1, 0));
        System.out.println(switchSolution(-1, 2));
    }
    public static int dummySolution(int a, int b){
        int sum = 0;
        if (a == b){
            return a;
        }
        if (a < b){
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public static int switchSolution(int a, int b){
        switch (Integer.compare(a, b)) {
            case 0 -> {
                return a;
            }
            case 1 -> {
                return IntStream.rangeClosed(b, a).sum();
            }
            case -1 -> {
                return IntStream.rangeClosed(a, b).sum();
            }
        }
        return 0;
    }
}
