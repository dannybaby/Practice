package com.company;

/**
 * Created by ydeng on 11/6/2014.
 */
public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        boolean is1row = false, is1col = false;
        for(int i = 0; i < matrix.length; i++)
            if(matrix[i][0] == 0)
                is1col = true;
        for(int j = 0; j <matrix[0].length; j++)
            if(matrix[0][j] == 0)
                is1row = true;
        for(int i = 1; i < matrix.length; i++)
            for(int j = 1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        for(int i = 1; i<matrix.length; i++)
            if(matrix[i][0] == 0)
                for(int j= 1; j<matrix[0].length; j++)
                    matrix[i][j] = 0;
        for(int j = 1; j<matrix[0].length; j++)
            if(matrix[0][j] == 0)
                for(int i =1; i<matrix.length; i++)
                    matrix[i][j] = 0;
        if(is1row)
            for(int j = 0; j<matrix[0].length; j++)
                matrix[0][j] = 0;
        if(is1col)
            for(int i=0;i<matrix.length; i++)
                matrix[i][0] = 0;
    }
}
