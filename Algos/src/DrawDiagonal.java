public class DrawDiagonal {

    public static void main(String[] args) {
        draw(8);
    }

    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == j || j == 0 || j == size - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
