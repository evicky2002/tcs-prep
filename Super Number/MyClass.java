public class MyClass {
    static boolean isStrong(int n) {
        boolean isStrong = false;
        int number = n;
        int remainder = 0;
        int result = 0;
        while (number > 0) {
            remainder = number % 10;
            System.out.println("rem : " + remainder);
            result += factorial(remainder);
            number /= 10;
        }
        if (n == result) {
            isStrong = true;
        }

        return isStrong;
    }

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isStrong(40585));
    }
}
