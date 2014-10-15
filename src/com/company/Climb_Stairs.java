package com.company;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.

 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


 * Created by ydeng on 10/14/2014.
 */
public class Climb_Stairs {
    public int climbStairs(int n){
        if(n == 0 || n == 1)
            return 1;
        int pre1 = 1;
        int pre2 = 1;
        int i = 2;
        while (i <= n){
            int res = pre1 + pre2;
            pre2 = pre1;
            pre1 = res;
            i++;
        }
        return pre1;
    }
}
