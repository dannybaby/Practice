package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ydeng on 11/3/2014.
 */
public class Permutations {
    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] num) {
        Integer[] numin = new Integer[num.length];
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i<num.length; i++)
            numin[i] = new Integer(num[i]);
        if(numin.length == 0)
            return ans;
        Arrays.sort(numin);
        res = Arrays.asList(numin);
        ans.add(new ArrayList<Integer>(res));
        int n = numin.length;
        int i, j, k;
        while(true){
            for( i = n-2; i>=0; i--)
                if(numin[i] < numin[i+1])
                    break;
            if(i==-1)
                return ans;
            for(j = n-1; j>i; j--)
                if(numin[j] > numin[i]){
                    Integer tmp = numin[i];
                    numin[i] = numin[j];
                    numin[j]= tmp;
                    break;
                }
            for(k = i+ 1; k<=(i+n)/2; k++){
                Integer tmp1 = numin[k];
                numin[k] = numin[n+i-k];
                numin[n+i-k] = tmp1;
            }
            res = Arrays.asList(numin);
            ans.add(new ArrayList<Integer>(res));
        }
    }
}
