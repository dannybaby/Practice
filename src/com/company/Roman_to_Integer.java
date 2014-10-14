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
public class Roman_to_Integer {
    public int romanToInt(String s) {
        int sum=roman(s.charAt(0));
        for(int i= 1; i< s.length(); i++){
            int pre = roman(s.charAt(i-1));
            int cur = roman(s.charAt(i));
            if( pre == cur)
                sum += cur;
            else if(pre > cur)
                sum += cur;
            else
                sum = sum + cur - 2*pre;
        }
        return sum;
    }
    
    public int roman(char s){
        if (s == 'I')
            return 1;
        else if(s == 'V')
            return 5;
        else if(s == 'X')
            return 10;
        else if(s == 'L')
            return 50;
        else if(s == 'C')
            return 100;
        else if(s == 'D')
            return 500;
        else if(s == 'M')
            return 1000;
        else 
            return 0;
    }    
}
