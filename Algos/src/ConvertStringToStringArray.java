//Write a function to split a string and convert it into an array of words.

import java.util.Arrays;

public class ConvertStringToStringArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dummySolution("I am Robin Hood")));
        System.out.println(Arrays.toString(betterSolution("I am Robin Hood")));
    }

    public static String[] dummySolution(String s){
        String[] arr = s.split(" ");
        return arr;
    }

    public static String[] betterSolution(String s){
        return s.split(" ");
    }
}
