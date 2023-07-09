//There was a test in your class and you passed it. Congratulations!
//        But you're an ambitious person. You want to know if you're better than the average student in your class.
//        You receive an array with your peers' test scores. Now calculate the average and compare your score!
//        Return True if you're better, else False!
//        Note:
//        Your points are not included in the array of your class's points.
//        For calculating the average point you may add your point to the given array!

import java.util.Arrays;

public class GradeAverage {
    public static void main(String[] args) {
        System.out.println(dummySolution(new int[]{2, 3}, 5));
        System.out.println(dummySolution(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 25));
        System.out.println("-----");
        System.out.println(coolSolution(new int[]{2, 3}, 5));
        System.out.println(coolSolution(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 25));
    }

    public static boolean dummySolution(int[] classPoints, int yourPoints) {
        int sum = yourPoints;
        for (int score : classPoints){
            sum += score;
        }
        if (sum / (classPoints.length + 1) < yourPoints){
            return true;
        } else return false;
    }

//    bacha na import java.util.Arrays;
    public static boolean coolSolution(int[] classPoints, int yourPoints) {
        return yourPoints > (int) Arrays.stream(classPoints).average().orElse(0);
    }
}
