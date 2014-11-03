package com.company;

/**
 * Created by ydeng on 11/3/2014.
 */
public class Search_in_Rotated_Sorted_Array {
    public boolean search(int[] A, int target) {
        if(A.length == 0)
            return false;
        int i = 0;
        int j = A.length - 1;
        while(i <=  j){
            int mid = (i+j)/2;
            if(A[mid] == target || A[i] == target || A[j] == target)
                return true;
            else if(A[i] < A[mid]){
                if(A[i] <= target && target <= A[mid])
                    j = mid - 1;
                else
                    i = mid + 1;
            }
            else if(A[i] == A[mid]){
                int k = mid;
                for(k = mid ; k>i; k--)
                    if(A[k] != A[mid]){
                        j= k;
                        break;
                    }
                if(k == i)
                    i = mid + 1;
            }
            else{
                if(A[j]>= target && target >= A[mid])
                    i = mid + 1;
                else
                    j = mid -1;
            }
        }
        return false;
    }
}
