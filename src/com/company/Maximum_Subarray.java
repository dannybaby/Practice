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
public class Maximum_Subarray {
    public int maxSubArray(int[] A){
        int maxsum = A[0];
        int sum = 0;
        for(int i = 0; i<A.length; i++){
            sum += A[i];
            if(sum > maxsum)
                maxsum = sum;
            if(sum<0);
                sum = 0;
        }
        return maxsum;
    }
}
