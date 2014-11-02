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
    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<Integer> res = new ArrayList<Integer>();
    public List<List<Integer>> permute(int[] num) {
        Integer[] numin = new Integer[num.length];
        for(int i = 0; i<num.length; i++)
            numin[i] = num[i];
        if(numin.length == 0)
            return ans;
        if(numin.length == 1){
            res.add(numin[0]);
            ans.add(res);
            return ans;
        }
        nonpermute(numin);
        return this.ans;
    }
    
    public void nonpermute(Integer[] num){
        if(num.length == 0){
            ans.add(new ArrayList<Integer>(res));
            
            System.out.println("ans"+ans);
        }
        else{
        for(int i =0 ; i<num.length; i++){
            res.add(num[i]);
            System.out.println("Add" + res);
            Integer[] newarray = new Integer[num.length - 1];
            for(int k=0; k<i; k++)
                newarray[k] = num[k];
            for(int k = i+1; k<num.length; k++)
                newarray[k-1] = num[k];
            nonpermute(newarray);
            res.remove(res.size()-1);
            System.out.println(res);
        }
        }
    }   
}
