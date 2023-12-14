package main;

public class SignTheProductAnArray {

    public static int arraySign(int[] nums) {
        if (nums[0] > 0) nums[0] = 1;
        if (nums[0] < 0) nums[0] = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) nums[0] *= 1;
            if (nums[i] < 0) nums[0] *= -1;
        }

        return nums[0];
    }

    public static void main(String[] args) {
        var result = arraySign(new int[]{1,5,0,2,-3});
        System.out.println(Integer.toString(result));
    }
}

