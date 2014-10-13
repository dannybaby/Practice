package com.company;

/**
 * List Node Class
 * Created by ydeng on 10/13/2014.
 */
public class ListNode<T> {
    T val;
    ListNode<T> next;
    ListNode() {}
    ListNode(T x){val = x; next = null;}
}
