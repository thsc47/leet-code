package main;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        if(n == 1) return mat[0][0];
        int sum = 0;
        int j = 0;
        for(int i = 0;i<n;i++){
            if((n & 1) == 1){
                if(j == n/2){
                    sum+=mat[i][j];
                }else{
                    sum+=mat[i][j] + mat[i][n-j-1];
                }
            }else{
                sum+=mat[i][j] + mat[i][n-j-1];

            }
            j++;

        }
        return sum;
    }
}
