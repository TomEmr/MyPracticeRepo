public class DuplicateEncoder {

    public static void main(String[] args) {

        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
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
}

//    The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
//        Examples
//        "din"      =>  "((("
//        "recede"   =>  "()()()"
//        "Success"  =>  ")())())"
//        "(( @"     =>  "))(("
