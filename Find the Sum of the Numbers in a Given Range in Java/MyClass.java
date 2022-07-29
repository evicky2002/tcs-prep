//if it feels complicated just brute force the solution

public class MyClass {

    static int sumOfRangeForward(int total, int start, int end) {
        if (start > end) {
            return total;
        } else {
            return start + sumOfRangeForward(total, start + 1, end);
        }
    }

    static int sumOfRangeBackward(int total, int start, int end) {
        if (end < start) {
            return total;
        } else {
            return end + sumOfRangeForward(total, start, end - 1);
        }
    }

    static int sumOfRangeEasy(int total, int start, int end) {
        return start > end ? total : start + sumOfRangeEasy(total, start + 1, end);
    }

    public static void main(String[] args) {
        System.out.println("Forward sum : " + sumOfRangeForward(0, 1, 5));
        System.out.println("Backward sum : " + sumOfRangeBackward(0, 1, 5));
        System.out.println("One liner : " + sumOfRangeEasy(0, 1, 5));
    }
}
