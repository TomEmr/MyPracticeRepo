
//This time no story, no theory. The examples below show you how to write function accum:
//        Examples:
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
//        The parameter of accum is a string which includes only letters from a..z and A..Z.
public class Mumbling {

    public static void main(String[] args) {
        System.out.println(dummySolution("abcd"));
        System.out.println(mumbling("abcd"));
    }


    public static String mumbling(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++){
                sb.append(Character.toLowerCase(c));
            }
            sb.append("-");
        }
        return sb.deleteCharAt(sb.length()- 1).toString();
    }
    public static String dummySolution(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(c));
            }
            if (i != s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
