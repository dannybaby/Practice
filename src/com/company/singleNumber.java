/*
Given an array of integers, every element appears twice except for one. Find that single one.
 */
package com.company;

public class singleNumber{
    public int singe_number(int[] A){
        for (int i = 1; i< A.length; i++){
            A[0] = A[0] ^ A[i];
        }
        return A[0];
    }
}
