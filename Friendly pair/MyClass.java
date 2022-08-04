// The numbers whose sum of divisors / number ratio is same are known as Friendly Pair Numbers.
public class MyClass {
    static boolean isFriendlyPair(int a, int b) {
        boolean isFriendlyPair = false;
        int factorsSumA = 0;
        int factorsSumB = 0;
        double ratioA, ratioB;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                factorsSumA += i;
            }
        }
        for (int j = 1; j <= b / 2; j++) {
            if (b % j == 0) {
                factorsSumB += j;
            }
        }
        ratioA = factorsSumA / a;
        ratioB = factorsSumB / b;
        if (ratioA == ratioB) {
            isFriendlyPair = true;
        }
        return isFriendlyPair;
    }

    public static void main(String[] args) {
        System.out.println(isFriendlyPair(30, 120));
    }
}
