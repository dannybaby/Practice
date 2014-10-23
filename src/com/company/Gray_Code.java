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
import java.util.ArrayList;
import java.util.List;
public class Gray_Code {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList();
        res.add(0);
        if(n == 0)
            return res;
        res.add(1);
        if(n == 1)
            return res;
        for(int i = 2; i <= n; i++){
            for(int j=res.size() - 1; j >=0; j--){
                Integer tmp = (Integer)(1 << (i-1)) + res.get(j);
                res.add(tmp);
            }
        }
        return res;
    }    
}
