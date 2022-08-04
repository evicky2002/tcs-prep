// Calculate lcm by hcf using the formula lcm = a*b / hcf
public class MyClass {
    static int lcm(int a, int b) {
        int hcf = getHCF(a, b);
        return ((a * b) / hcf);
    }

    static int getHCF(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(lcm(2, 17));
    }

}
