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
public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] A) {
        if(A.length == 0)
            return 0;
        if(A.length == 1)
            return 1;
        int res = 0;
        int count =0;
        int pre = A[0];
        int i = 1;
        while(i < A.length){
            if(A[i] == pre){
                count++;
                i++;
            }
            else{
                A[i-count]= A[i];
                pre = A[i];
                i++;
            }
        }
        return A.length-count;
    }    
}
