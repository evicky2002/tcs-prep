public class MyClass {
    static int octalToDecimal(int n) {
        int result = 0;
        int remainder = 0;
        int power = 0;
        while (n > 0) {
            remainder = n % 10;
            result += remainder * Math.pow(8, power);
            n /= 10;
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(octalToDecimal(2001));
    }
}
