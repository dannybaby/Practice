package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ydeng on 11/11/2014.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> cur = new LinkedList<Integer>();
        int i= 1;
        int j = 1;
        if(k > n)
            return res;
        for(i = 1; i <= k; i++)
            cur.add(i);
        res.add(new LinkedList<Integer>(cur));
        while(true){
            if(cur.get(k-1) == n){
                if(cur.get(0) == (n - k + 1))
                    return res;
                else{
                    for(j = k - 2 ; j>=0; j--){
                        if(cur.get(j) < (n-k + j + 1)){
                            cur.set(j, cur.get(j) + 1);
                            for(int m = j + 1; m <= k - 1; m++){
                                cur.set(m, cur.get(j) + m - j);
                            }
                            res.add(new LinkedList<Integer>(cur));
                            break;
                        }
                    }
                }
            }
            else{
                cur.set(k-1, cur.get(k-1) + 1);
                res.add(new LinkedList<Integer>(cur));
            }
        }
    }
}
