package main;

import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i =0;i<accounts.length;i++) {
            int temp = 0;
            for (int j = 0;j<accounts[i].length;j++) {
                temp+=accounts[i][j];
            }
            if (temp > result) result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] i = new int[][]{{1,2,3},{3,2,1}};
        int[][] a = new int[][]{{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(i));
        System.out.println(maximumWealth(a));
    }
}
