package main;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    class Solution {
        public void setZeroes(int[][] matrix) {
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<matrix.length;i++) {
                for(int j=0;j<matrix[0].length;j++) {
                    if(matrix[i][j] == 0)
                        list.add((i*1000)+j);
                }
            }
            for(int i=0;i<list.size();i++) {
                int r = list.get(i)/1000;
                int c = list.get(i)%1000;

                for(int p=0;p<matrix[0].length;p++)
                    matrix[r][p] = 0;
                for(int p=0;p<matrix.length;p++)
                    matrix[p][c] = 0;
            }
        }
    }

}
