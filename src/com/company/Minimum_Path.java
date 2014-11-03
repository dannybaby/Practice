package com.company;

/**
 * Created by ydeng on 11/3/2014.
 */
public class Minimum_Path {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] res = new int[m][n];
        res[m-1][n-1] = grid[m-1][n-1];
        for(int i = m -2; i>=0; i--)
            res[i][n-1] = grid[i][n-1]+res[i+1][n-1];
        for(int j= n-2; j>=0; j--)
            res[m-1][j] = grid[m-1][j] + res[m-1][j+1];
        for(int i = m -2 ; i>=0; i--)
            for(int j= n-2; j>=0; j--){
                int a = Math.min(res[i+1][j],res[i][j+1]);
                res[i][j] = grid[i][j] + a;
            }
        return res[0][0];
    }
}
