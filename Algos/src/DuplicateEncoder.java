import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    public static void main(String[] args) {

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
        System.out.println(encodeMap("din"));
        System.out.println(encodeMap("recede"));
        System.out.println(code("recede"));
    }


    public static String code(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                sb.append('(');
            } else {
                sb.append(')');
            }
        }
        return sb.toString();
    }
    public static String encode(String word) {
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        for (char c : word.toCharArray()) {
            int count = 0;
            for (char d : word.toCharArray()) {
                if (c == d) {
                    count++;
                }
            }
            if (count == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }

    public static String encodeMap(String word) {
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : word.toCharArray()) {
            if (map.get(c) == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }
}

//    The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//        Examples
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("
