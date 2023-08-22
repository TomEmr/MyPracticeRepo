public class UniqueOrder {

    public static void main(String[] args) {
        System.out.println(uniqueInOrder("AAAABBBCCDAABBB"));
        System.out.println(uniqueInOrder("ABBCcAD"));
        System.out.println(uniqueInOrder("12233"));
        System.out.println(uniqueInOrder("AB"));
        System.out.println(uniqueInOrder("A"));
        System.out.println(uniqueInOrder(""));
    }

    public static String uniqueInOrder(String iterable) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterable.length(); i++) {
            if (i == 0 || iterable.charAt(i) != iterable.charAt(i - 1)) {
                sb.append(iterable.charAt(i));
            }
        }
        return sb.toString();
    }
}
