package com.company;

import java.util.List;

/**
 * Created by ydeng on 10/13/2014.
 */
public class SingleList<T> {
    ListNode<T> head;
    public SingleList(){}
    public SingleList(ListNode<T> x){
        head = x;
    }

    public ListNode<T> add(T node){
        if( head == null){
            head = new ListNode<T>();
            head.val = null;
            head.next = null;
        }
        ListNode<T> tmp = new ListNode<T>(node);
        tmp.next = head.next;
        head.next = tmp;
        return head;
    }

    public void clear(){
        head = null;
    }

}
