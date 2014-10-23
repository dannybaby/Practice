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
public class Merge_Sorted_Array {
    public void merge(int A[], int m, int B[], int n) {
        if(m == 0 && n != 0){
            for(int i = 0; i<n; i++)
                A[i]=B[i];
            return;
        }
        if(n == 0)
            return;
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(A[i] > B[j])
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        while(j>=0)
            A[k--] = B[j--];
        while(i>=0)
            A[k--] = A[i--];
    }    
}
