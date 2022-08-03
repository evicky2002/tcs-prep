//Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
public class MyClass {
    static boolean isHarshad(int n) {
        boolean isHarshad = false;
        int result = 0;
        int number = n;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            result += remainder;
            number /= 10;
        }
        if (n % result == 0) {
            isHarshad = true;
        }
        return isHarshad;
    }

    public static void main(String[] args) {
        System.out.println(isHarshad(4991));
    }
}
