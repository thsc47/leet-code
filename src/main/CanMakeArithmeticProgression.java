package main;

import java.util.Arrays;

public class CanMakeArithmeticProgression {

    public static boolean result (int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for (int i =1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]!=d)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var a = result(new int[]{3,5,1});
        System.out.println(a);
    }
}
