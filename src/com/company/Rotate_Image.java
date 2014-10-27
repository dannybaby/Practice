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
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int tmp = 0;
        for(int i=0; i < (n/2); i++){
            for(int j=i; j < (n-i-1); j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=tmp;
            }
        }
    }    
}
