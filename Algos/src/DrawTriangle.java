public class DrawTriangle {
    public static void main(String[] args) {
        draw(5);
    }
    public static void draw(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
