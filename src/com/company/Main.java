package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*SingleList<String> testlist = new SingleList<String>();
        testlist.add("a");
        testlist.add("b");
        testlist.add("c");
        testlist.add("d");
        ListNode<String> p = testlist.head;
        while (p.next != null){
            p = p.next;
        }
        p.next = testlist.head.next.next;
        Linked_List_Cycle<String> res = new Linked_List_Cycle<String>();
        System.out.println(res.FindCycleStartPoint(testlist.head));
        System.out.println(res.CycleLength(testlist.head));
        N_Queens test = new N_Queens();
        List<String[]> res = test.solveNQueens2(100);
        for (String[] re : res) {
            System.out.println(Arrays.toString(re));*/
        int[] test = new int[]{0,1};
        int tmp = test[0];
        test[0] = test[1];
        test[1] = tmp;
        System.out.println(test);

    }
    public static List<List<Integer>> permute(int[] num) {
        Integer[] numin = new Integer[num.length];
        for(int i = 0; i<num.length; i++)
            numin[i] = new Integer(num[i]);
        List<Integer> l = Arrays.asList(numin);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numin.length == 0)
            return res;
        if(numin.length == 1){
            res.add(l);
            return res;
        }
        for(int i = 0 ; i<numin.length; i++)
            for(int j = i + 1 ; j< numin.length; j++){
                Integer tmp = numin[i];
                numin[i] = numin[j];
                numin[j] = tmp;
                List<Integer> l1 = Arrays.asList(numin);
                System.out.println(numin.toString());
                res.add(l1);
            }
        for(int i = 0 ; i<numin.length; i++)
            for(int j = i + 1; j< numin.length; j++){
                Integer tmp = numin[i];
                numin[i] = numin[j];
                numin[j] = tmp;
                List<Integer> l2 = Arrays.asList(numin);
                System.out.println(numin.toString());
                res.add(l2);
            }
        return res;
    }
}

