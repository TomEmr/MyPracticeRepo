import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsogramCheck {
    public static void main(String[] args) {

        System.out.println(set("asdfghj"));
        System.out.println(set("assssss"));
        System.out.println(loop("asdfghj"));
        System.out.println(loop("assssss"));
    }

    public static boolean set(String s) {
        String[] str = s.split("");
        Set<String> set = new HashSet<>();
        for (String c : str) {
            set.add(c);
        }
        return str.length == set.size() ? true : false;
    }

    public static boolean loop(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
