public class TwoStrings {

    public static void main(String[] args) {

        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println("copilotSolution");
        System.out.println(copilotSolution("hello", "world"));
        System.out.println(copilotSolution("hi", "world"));
    }

    public static boolean twoStrings(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean copilotSolution(String a, String b) {
        for (char c : a.toCharArray()) {
            if (b.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}

//    Given two strings, determine if they share a common substring. A substring may be as small as one character.
//
//        Example
//
//
//        These share the common substring .
//
//
//
//        These do not share a substring.
//
//        Function Description
//
//        Complete the function twoStrings in the editor below.
//
//        twoStrings has the following parameter(s):
//
//        string s1: a string
//        string s2: another string
//        Returns
//
//        string: either YES or NO
//        Input Format
//
//        The first line contains a single integer , the number of test cases.
//
//        The following  pairs of lines are as follows:
//
//        The first line contains string .
//        The second line contains string .