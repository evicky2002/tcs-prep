public class MyClass {
    static void primeRange(int n, int m) {
        if (n == 1) {
            n++;
        }
        int start = n;
        while (start <= m) {
            boolean isPrime = true;
            for (int i = 2; i <= start / i; i++) {
                if (start % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(start);
            }
            start++;
        }
    }

    static void primeSeries(int n) {
        if (n == 1) {
            System.out.println("Nor a Prime or composite");
            return;
        }
        int j = 2;
        while (j <= n) {
            boolean isPrime = true;
            for (int i = 2; i <= j / i; i++) {
                if (j % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
            j++;
        }

    }

    public static void main(String[] args) {
        // primeSeries(7);
        primeRange(10, 30);
    }
}
