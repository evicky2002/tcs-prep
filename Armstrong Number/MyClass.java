// A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself
// 
public class MyClass {
    static boolean isArmstrong(int n, int len) {
        boolean isArmstrong = false;
        int number = n;
        int result = 0;
        int remainder = 0;
        while (n > 0) {
            remainder = n % 10;
            result += Math.pow(remainder, len);
            n /= 10;
        }
        if (number == result) {
            isArmstrong = true;
        }
        return isArmstrong;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(1634, 4));
    }

}
