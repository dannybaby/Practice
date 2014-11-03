package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ydeng on 10/29/2014.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        if(numRows==0)
            return res;
        tmp.add(1);
        res.add(tmp);
        int i = 1;
        while(i<numRows){
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 1; j<i; j++){
                Integer sum = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                cur.add(sum);
            }
            cur.add(1);
            res.add(cur);
            i++;
        }
        return res;
    }
}
