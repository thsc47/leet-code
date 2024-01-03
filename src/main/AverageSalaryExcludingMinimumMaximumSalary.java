package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AverageSalaryExcludingMinimumMaximumSalary {

    public static double average(int[] salary) {
        double result=0;
        Arrays.sort(salary);
        for(int i=1; i < salary.length-1; i++) {
            result+=salary[i];
        }

        return result/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{4000,3000,1000,2000};
        int[] array2 = new int[]{1000,2000,3000};

        System.out.println(average(array1));
        System.out.println(average(array2));
    }
}
