
public class MyClass {
    static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 1) {
            return true;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(16));
    }
}
