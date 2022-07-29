public class MyClass {
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
        primeSeries(7);
    }
}
