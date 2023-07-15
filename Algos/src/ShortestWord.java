import java.util.Arrays;

//Simple, given a string of words, return the length of the shortest word(s).
public class ShortestWord {

        public static void main(String[] args) {
            System.out.println(dummySolution("I am Robin Hood"));
            System.out.println(dummySolution("bitcoin take over the world maybe who knows perhaps"));
            System.out.println(dummySolution("turns out random test cases are easier than writing out basic ones"));
            System.out.println("-----");
            System.out.println(coolSolution("I am Robin Hood"));
            System.out.println(coolSolution("bitcoin take over the world maybe who knows perhaps"));
            System.out.println(coolSolution("turns out random test cases are easier than writing out basic ones"));

        }

//        když hledám minimum, na začátku int min = Integer.MAX_VALUE; pak je to easy
        public static int dummySolution(String s){
            String[] arr = s.split(" ");
            int min = Integer.MAX_VALUE;
            for (String str : arr) {
                if (str.length() < min){
                    min = str.length();
                }
            }
            return min;
        }
//klasika cool stream řešení no
        public static int coolSolution(String s){
            return Arrays.stream(s.split(" "))
                    .mapToInt(String::length)
                    .min()
                    .getAsInt();
        }
}
