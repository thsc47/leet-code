package main;

import java.util.ArrayList;
import java.util.List;

public class CountOddNumbersInRange {

    public static int countOdds(int low, int high) {
        if(low%2==0 && high%2==0) {
            return (high-low)/2;
        }
        else {
            return (high-low)/2+1;
        }
    }

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
    }
}
