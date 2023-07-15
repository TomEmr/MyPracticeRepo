public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(recursion(9));
        System.out.println(recursion(1));
        System.out.println(recursion(0));
        System.out.println("-----");
        System.out.println(loop(9));
        System.out.println(loop(1));
        System.out.println(loop(0));
    }

    public static int recursion(int n){
        if (n < 2){
            return n;
        } return recursion(n - 1) + recursion(n - 2);
    }

    public static int loop(int n){
        int a = 0;
        int b = 1;
        int c;
        if (n < 2){
            return n;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

