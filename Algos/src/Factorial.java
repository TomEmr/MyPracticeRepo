public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursion(1));
        System.out.println(factorialRecursion(0));
        System.out.println("-----");
        System.out.println(factorialLoop(5));
        System.out.println(factorialLoop(1));
        System.out.println(factorialLoop(-2));
    }

    private static int factorialRecursion(int n) {
        if (n < 0){
            throw new IllegalArgumentException("n must be greater than 0");
        }
        if (n < 2){
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    private static int factorialLoop(int n) {
        if (n < 0){
            throw new IllegalArgumentException("n must be greater than 0");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        } return result;
    }
}
