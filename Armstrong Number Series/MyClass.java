public class MyClass {
    static void armstrongSeries(int a, int b) {
        for (int i = a; i <= b; i++) {
            int currentNumber = i;
            int copy = i;
            int result = 0;
            int remainder = 0;
            int numberOrder = numberOrder(currentNumber);
            while (currentNumber > 0) {
                remainder = currentNumber % 10;
                result += Math.pow(remainder, numberOrder);
                currentNumber /= 10;
            }
            if (result == copy) {
                System.out.println(result);
            }
        }

    }

    static int numberOrder(int n) {
        int result = 0;
        while (n > 0) {
            result++;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        armstrongSeries(1, 200000);
    }
}
