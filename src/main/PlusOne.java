package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            else
                array[i] = 0;
        }

        int[] newArray = new int[array.length + 1];
        newArray[0] = 1;

        return newArray;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        int[] array2 = new int[]{9};
        System.out.println(Arrays.toString(plusOne(array2)));
    }
}
