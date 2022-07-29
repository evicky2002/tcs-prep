class MyClass {
    static int sumOfNNumbers(int n) {
        return n == 0 ? n : n + sumOfNNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(2));
    }
}