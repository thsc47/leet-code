package main;

import java.util.Arrays;

import static java.lang.String.format;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1)
        {
            nums[i] = 0;
            i++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        int[] result = moveZeroes(array);
        System.out.println(Arrays.toString(result));
    }
}

