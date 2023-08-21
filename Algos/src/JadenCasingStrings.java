import java.util.Arrays;

public class JadenCasingStrings {

    public static void main(String[] args) {

        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(coolSolution("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String s : phrase.split(" ")) {
            sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String coolSolution(String phrase){
        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce((a, b) -> a + " " + b)
                .orElse(null);
    }

}
