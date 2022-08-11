import java.util.Arrays;

public class MyClass {
    static int[] secondLargestAndSmallest(int[] nums) {
        int[] result = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) {
                secondMax = Math.max(nums[i], secondMax);
            }
            if (nums[i] != min) {
                secondMin = Math.min(nums[i], secondMin);
            }
        }
        result[0] = secondMin;
        result[1] = secondMax;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(secondLargestAndSmallest(arr)));
    }
}
