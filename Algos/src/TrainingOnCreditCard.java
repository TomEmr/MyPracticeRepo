public class TrainingOnCreditCard {

    public static void main(String[] args) {

        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Skippy"));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            masked.append("#");
        }
        masked.append(str.substring(str.length() - 4));
        return masked.toString();
    }
}

//    Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//        Examples (input --> output):
//        "4556364607935616" --> "############5616"
//        "64607935616" -->      "#######5616"
//        "1" -->                "1"
//        "" -->                 ""
//
//// "What was the name of your first pet?"
//        "Skippy" --> "##ippy"
//        "Nananananananananananananananana Batman!" --> "####################################man!"
