package com.company;

/**
 * Created by ydeng on 10/15/2014.
 */
public class Integer_to_Roman {
    public String intToRoman(int num) {
        String table[]= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        int values[] ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String res="";
        int i =0;
        while(i<13){
            while(num>=values[i]){
                res += table[i];
                num -= values[i];
            }
            i++;
        }
        return res;
    }

    public String integerToRoman(int num){
        String[] roman ={"I","V","X","L","C","D","M"};
        String res = "";
        for(int base = 0; num> 0; num /=10 ){
            int x = num % 10;
            switch(x){
                case 1:
                case 2:
                case 3:
                    for(int i=1 ;i <=x; i++)
                        res = roman[base] + res;
                    break;
                case 4:
                    res = roman[base + 1] + res;
                    res = roman[base] + res;
                    break;
                case 5:
                    res = roman[base + 1] + res;
                    break;
                case 6:
                case 7:
                case 8:
                    for(int i=6; i<=x; i++)
                        res = roman[base] + res;
                    res = roman[base + 1] + res;
                    break;
                case 9:
                    res = roman[base + 2] +res;
                    res = roman[base] +res;
                    break;
                default:
                    break;
            }
            base += 2;
        }
        return res;
    }
}
