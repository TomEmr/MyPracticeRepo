public class DrawDiamond {

    public static void main(String[] args) {
        draw(5);
        System.out.println(draw2(5));
    }

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static String draw2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                sb.append(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                sb.append("*");
            sb.append("\n");
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++)
                sb.append(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                sb.append("*");
            sb.append("\n");
        }

        return sb.toString();
    }

//    public static String print(int n) {
//        // TODO your code here
//        if (n < 0 || (n & 1) == 0) return null;
//        StringBuilder diamond = new StringBuilder();
//        for(int i = 1; i <= n; i+=2) {
//            for(int j = 0; j < (n - i) / 2; j++){
//                diamond.append(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                diamond.append("*");
//            }
//            diamond.append("\n");
//        }
//        for (int i = 1; i < n; i+=2){
//            for (int j = 0; j < i /2 + 1; j++) {
//                diamond.append(" ");
//            }
//            for (int j = 1; j < n - i; j++){
//                diamond.append("*");
//            }
//            diamond.append("\n");
//        }
//        return diamond.toString();
//    }
}
