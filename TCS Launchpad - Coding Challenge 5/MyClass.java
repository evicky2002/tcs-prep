import java.util.*;

class MyClass {
    public static void main(String[] a) {
        boolean reached = false;
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(kb.nextLine());
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                reached = true;
                System.out.println(arr[i]);
            }
        }
        if (!reached) {
            System.out.println("No Even Elements Found.");
        }
    }
}