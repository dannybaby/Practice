/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author newstar
 */
public class Permutations {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        int n = num.length;
        int i,j;
        if(n==0)
            return null;
        int k = 0;
        while(k<2){
        for(i = 0; i< n; i++)
            for(j = i+1; j<n; j++){
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
                List cur = Arrays.asList(num);
                res.add(cur);
            }
        k++;
        }
        return res;
    }    
}
