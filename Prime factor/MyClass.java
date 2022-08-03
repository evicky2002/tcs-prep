public class MyClass {
    static void primeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int num = n;
                while (num % i == 0) {
                    System.out.println(i + " ");
                    num /= i;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        primeFactor(48);
    }

}
