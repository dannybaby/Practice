package com.company;

/**
 * Created by ydeng on 11/3/2014.
 */
public class Main {
    public static void main(String[] args){
        Minimum_Path test = new Minimum_Path();
        int[][] s = new int[][]{{1,1,5},{3,5,1},{1,2,3}};
        System.out.println(test.minPathSum(s));
    }
}
