/*
Given an array of integers, every element appears twice except for one. Find that single one.
 */
package com.company;
import java.util.Hashtable;
import java.util.Set;
public class singleNumber{
    public int singe_number(int[] A){
        for (int i = 1; i< A.length; i++){
            A[0] = A[0] ^ A[i];
        }
        return A[0];
    }

    public int single_number_3(int[] A){
        int res = 0;
        int[] count;
        count = new int[32];
        for(int j=0; j<32; j++){
            for(int i=0; i < A.length; i++){
                count[j] += ((A[i] >> j) & 1);
            }
            res += ((count[j] % 3) << j);

        }
        return res;
    }

    public int singleNumber3(int[] A) {
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for(int i = 0; i<A.length; i++){
            twos |= ones & A[i];
            ones = ones ^ A[i];
            threes = twos & ones;
            ones = ones & (~threes);
            twos = twos & (~threes);
        }
        return ones;
    }
}
