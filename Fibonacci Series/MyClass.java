public class MyClass {
    static int nthFibonacci(int n) {
        int result = 0;
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        while (i < n - 2) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            result = sum;
            i++;
        }
        System.out.println(result);
        return result;
    }

    static void fibonacciSeries(int n) {
        System.out.println("0");
        System.out.println("1");
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        int i = 0;
        while (i < n - 2) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
            i++;
        }
    }

    public static void main(String[] args) {
        nthFibonacci(10);
    }

}
