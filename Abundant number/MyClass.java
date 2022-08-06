//A Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant number.
public class MyClass {
    static boolean isAbundant(int n) {
        boolean isAbundant = false;
        int result = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        if (n < result) {
            isAbundant = true;
        }

        
        return isAbundant;
    }

    public static void main(String[] args) {
        System.out.println(isAbundant(13));
    }
}
