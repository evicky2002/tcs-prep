//A Number that when squared ends with the number itself is known as the Automorphic Number.
public class MyClass {
    static boolean isAutomorphic(int n) {
        boolean isAutomorphic = false;
        int square = n * n;
        int lastDigit = square % 10;
        if (lastDigit == n) {
            isAutomorphic = true;
        }
        return isAutomorphic;
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(7));
    }

}
