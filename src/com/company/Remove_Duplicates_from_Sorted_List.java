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
public class Remove_Duplicates_from_Sorted_List {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        int cur = head.val;
        ListNode pre = head;
        ListNode node = head.next;
        while(node!= null){
            if(node.val == cur){
                pre.next = node.next;
                node = node.next;
            }
            else{
                cur = node.val;
                pre = node;
                node = node.next;
            }
        }
        return head;
    }
}
