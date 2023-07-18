public class CountTheDivisors {

    public static void main(String[] args) {

        CountTheDivisors countTheDivisors = new CountTheDivisors();
        System.out.println(countTheDivisors.numberOfDivisors(4));
        System.out.println(countTheDivisors.numberOfDivisors(5));
        System.out.println(countTheDivisors.numberOfDivisors(12));
        System.out.println(countTheDivisors.numberOfDivisors(30));
        System.out.println(countTheDivisors.numberOfDivisors(4096));
    }

    public long numberOfDivisors(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                count++;
            }
        }
        return count;
    }
}
