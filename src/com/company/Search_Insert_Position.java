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
public class Search_Insert_Position {
    public int searchInsert(int[] A, int target){
        for(int i = 0; i<A.length; i++)
            if(A[i] >= target)
                return i;
        return A.length;
    }
    
    public int halfsearch(int[] A, int min, int max, int target){
        if(min > max)
            return -1;
        int mid = (min + max)/2;
        /*
        if(A[mid] == target)
            return mid;
        else if(A[mid] > target)
            return halfsearch(A, min, mid, target);
        else
            return halfsearch(A, mid+1, max, target);
        */
        int left,right;
        left = min;
        right = max;
        while(left<=right){
            mid = (left + right) / 2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
}
