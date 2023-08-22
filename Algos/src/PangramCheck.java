public class PangramCheck {

    public static void main(String[] args) {
        System.out.println(pangramCheck("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangramCheck("The quick brown fox jumps over the dog"));
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
}
