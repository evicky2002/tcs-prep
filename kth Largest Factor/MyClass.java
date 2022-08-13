import java.util.Arrays;

public class MyClass {
    static int kthLargestFactor(int a, int b) {
        int result = 0;
        int[] factors = new int[1];
        int position = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (position < factors.length) {
                    factors[position] = i;
                    position++;
                } else {
                    int[] doubleArray = new int[position * 2];
                    for (int j = 0; j < factors.length; j++) {
                        doubleArray[j] = factors[j];
                    }
                    factors = doubleArray;
                    factors[position] = i;
                    position++;
                }
            }
        }
        result = (position - b);
        if (result < 0) {
            result = 0;
        }
        return factors[result];
    }

    public static void main(String[] args) {
        System.out.println(kthLargestFactor(12, 3));

    }
}
