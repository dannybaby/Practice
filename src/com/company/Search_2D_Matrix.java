package com.company;

/**
 * Created by ydeng on 10/29/2014.
 */
public class Search_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int mid = 0;
        int left = 0 , right = m*n -1;
        while(left <= right){
            mid = left + (right - left)/2;
            int i = mid / n;
            int j = mid - i * n;
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target){
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return false;
    }
}
