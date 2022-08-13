import java.util.Scanner;

public class MyClass {
    static int numberOfPairs(int[] array, int target) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] - array[j] == target) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        int target = Integer.parseInt(kb.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(kb.nextLine());
        }
        int result = numberOfPairs(array, target);
        System.out.println(result);
    }
}
