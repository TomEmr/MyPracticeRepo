public class HighestScoringWord {

    public static void main(String[] args) {

        System.out.println(high("The quick brown fox jumps over the lazy dog"));

    }

    public static String high(String s) {
// výsledek
        String result = "";
//        integar pro maximální skóre
        int max = 0;
//        procházím slova (originální string rozdělím podle mezer)
        for (String word : s.split(" ")) {
//            integer pro součet znaků
            int sum = 0;
//            procházím znaky každého slova
            for (char c : word.toCharArray()) {
//                přičítám hodnotu znaku (a = 1, b = 2, c = 3, ...)
                sum += c - 'a' + 1;
            }
//            pokud je součet větší než maximální skóre, nahradím
            if (sum > max) {
                max = sum;
                result = word;
            }
        }
        return result;
    }
}


//    Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        For example, the score of abad is 8 (1 + 2 + 1 + 4).
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.