import java.util.Arrays;

public class TwoToOne {

    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

    public static String longest(String s1, String s2) {
//        zkombinuji oba stringy do jednoho
        String combined = s1 + s2;
//        vytvorim si pole znaku
        char[] arr = combined.toCharArray();
//        seradim pole znaku
        Arrays.sort(arr);
//        vytvorim si novy prazdny string, měl by být SB
        String newS1 = "";
//        projdu pole znaku a pokud je na pozici i 0 nebo se znak na pozici i nerovna znaku na pozici i-1, tak znak na pozici i přidám do nového stringu
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                newS1 += arr[i];
            }
        }
        return newS1;
    }
}

//Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
//
//        Examples:
//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

