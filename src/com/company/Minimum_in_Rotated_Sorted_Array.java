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
public class Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] num) {
        if(num.length == 1)
            return num[0];
        int i = 0;
        int j = num.length - 1;
        int res = 0;
        while(j>=i){
            if(num[i] <= num[j]){
                res = num[i];
                break;
            }
            int mid = (i + j) / 2;
            if(num[i] <= num[mid])
                i = mid + 1;
            else
                j = mid ;
        }
        return res;
    }    
}
