public class DrawChessTable {

    public static void main(String[] args) {
        draw(8);
    }

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("%%");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
