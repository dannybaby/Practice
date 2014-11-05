package com.company;

/**
 * Created by ydeng on 11/3/2014.
 */
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
        
        Permutations test = new Permutations();
        int[] num = new int[]{0,1,3};
        System.out.println(test.permute(num));

    }
}
