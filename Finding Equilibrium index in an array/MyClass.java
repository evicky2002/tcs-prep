//Finding Equilibrium index in an array
//Simple brute force

public class MyClass {

    public static int equilibrium(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            System.out.println("leftsum: " + leftSum);

            for (int k = i + 1; k < array.length; k++) {
                System.out.println("here k");
                rightSum += array[k];
            }
            System.out.println("rightsum: " + rightSum);

            if (leftSum == rightSum) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 4 };
        System.out.println(equilibrium(arr));
    }
}