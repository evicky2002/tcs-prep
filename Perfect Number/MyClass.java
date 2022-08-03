// A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.
public class MyClass {
    static boolean isPerfectNumber(int n) {
        boolean isPerfectNumber = false;
        int result = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        if (result == n) {
            isPerfectNumber = true;
        }
        return isPerfectNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }
}
