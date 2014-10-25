/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author newstar
 */
public class Unique_Paths {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0)
            return 0;
        if(m == 1 || n == 1)
            return 1;
        int[][] res = new int[m+1][n+1];
        int i = 1;
        int j = 1;
        for(i = 1; i<= n; i++)
            res[m][i] = 1;
        for(i = 1; i<= m; i++)
            res[i][n] = 1;
        for(i = m - 1; i>=1 ; i--)
            for(j = n -1 ; j >= 1; j--){
                res[i][j] = res[i+1][j] + res[i][j+1];
            }
        return res[1][1];
    }
       
}
