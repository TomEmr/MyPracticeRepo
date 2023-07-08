//Complete the function that accepts a string parameter, and reverses each word in the string.
// All spaces in the string should be retained.

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(dummySolution("This is an example!"));
    }
//rozdělím slovo na array slov podle mezer
//    podmínka - pokud je array o délce 0 tak vrat původní string!!!!!!!
//    stringbuilder
//beru každé slovo z array - for each loop
//    do ní vnořená for i loopa, která jde od konce slova na jeho začátek a appenduje chat na daném indexu
//    po každém slově přidat mezeru!!!!
//    vracím výsledek(stringbuilder) takže .toString a potom .trim() odstraní mezery apod před a za
    public static String dummySolution(String s) {
        String[] arr = s.split(" ");

        if (arr.length == 0) {
            return s;
        }
        StringBuilder result = new StringBuilder();

        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
