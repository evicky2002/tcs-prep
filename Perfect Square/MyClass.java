// 1. Take the square root the given number and round it to the nearest integer
// 2. Multiply the square roots and see whether its equal to the given number
// 3. If its equal then return true.

public class MyClass {
    static boolean isPerfectSquare(int n) {
        boolean isPerfectSquare = false;
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            isPerfectSquare = true;
        }
        return isPerfectSquare;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(63));
    }
}
