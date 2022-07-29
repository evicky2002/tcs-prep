public class MyClass {
    static int reverse(int n) {
        int remainder = 0;
        int result = 0;
        while (n > 0) {
            remainder = n % 10;
            result = result * 10 + remainder;
            System.out.println(remainder);
            System.out.println(result);

            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
