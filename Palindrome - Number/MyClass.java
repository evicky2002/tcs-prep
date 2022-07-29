public class MyClass {

    static boolean isPalindrome(int n) {
        boolean isPalindrome = false;
        int number = n;
        int result = 0;
        int remainder = 0;
        while (n > 0) {
            remainder = n % 10;
            result = result * 10 + remainder;
            n /= 10;
        }
        if (number == result) {

            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1781));
    }
}
