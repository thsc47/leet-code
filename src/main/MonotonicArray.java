package main;

public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        var isIncrease = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncrease = false;
                break;
            }
        }

        var isDecreasing = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i + 1]) {
                isDecreasing = false;
                break;
            }
        }
        return isDecreasing || isIncrease;
    }

    public static void main(String[] args) {
        var array1 = new int[]{1,2,2,3};
        var array2 = new int[]{6,5,4,4};
        var array3 = new int[]{1,3,2};

        System.out.println(isMonotonic(array1));
        System.out.println(isMonotonic(array2));
        System.out.println(isMonotonic(array3));
    }
}
