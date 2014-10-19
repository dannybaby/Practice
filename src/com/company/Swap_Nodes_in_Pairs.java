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
public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head.next;
        head.next = swapPairs(head.next.next);
        dummyhead.next.next = head;
        return dummyhead.next;
    } 
    public ListNode NRswapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p = head.next.next;
        ListNode pre = head;
        head = head.next;
        head.next = pre;
        pre.next = null;
        while(p != null && p.next !=null){
                ListNode tmp = p.next.next;
                pre.next = p.next;
                pre.next.next = p;
                pre = p;
                pre.next = null;
                p = tmp;
        }
        if(p!=null)
            pre.next = p;
        return head;
    }
}
