import java.util.HashSet;
import java.util.Set;

public class PangramCheck {

    public static void main(String[] args) {
        System.out.println(pangramCheck("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangramCheckSet("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangramCheck("The quick brown fox jumps over the dog"));
        System.out.println(pangramCheckSet("The quick brown fox jumps over the dog"));


    }

    public static boolean pangramCheck(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (String c : alphabet.split("")) {
            if (!s.toLowerCase().contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean pangramCheckSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
