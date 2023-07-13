//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//        Examples input/output:
//        XO("ooxx") => true
//        XO("xooxx") => false
//        XO("ooxXm") => true
//        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//        XO("zzoo") => false

public class XO {

    public static void main(String[] args) {
        System.out.println(dummySolution("ooxx"));
        System.out.println(dummySolution("xooxx"));
        System.out.println(dummySolution("ooxXm"));
        System.out.println(dummySolution("zpzpzpp"));
    }

    public static boolean dummySolution(String s){
        int x = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'x'){
                x++;
            } else if (c == 'o'){
                o++;
            }
        }
        return x == o;
    }
}
