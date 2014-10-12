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
public class Reverse_Integer {
    public int reverse(int x){
        boolean isneg = false;
        int res = 0;
        final int max = 0x7fffffff;
        final int min = 0x80000000;
        if(x<0){
            x = -x;
            isneg = true;
        }
        while (x>0){
            res = res * 10 + (x % 10);
            if(res > max){
                res = max;
                return max;
            }
            x = x / 10;
        }
        return isneg?(-res):res;
    }
}
