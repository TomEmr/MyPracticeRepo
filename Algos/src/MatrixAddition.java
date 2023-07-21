public class MatrixAddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {
//když ze zadání vím, že jsou čtvercové a nemusím to checkovat, tak je chill udělat si jednu proměnnou size a pak ji používat
        int size = a.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}
