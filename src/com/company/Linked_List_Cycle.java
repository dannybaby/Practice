package com.company;

/**
 * 1. whether the linked list has cycle
 * 2. what's the length of the cycle
 * 3. what's the start position from head  the cycle starts?
 * Created by ydeng on 10/13/2014.
 */
public class Linked_List_Cycle<T> {
    public boolean hasCycle(ListNode<T> head){
        ListNode<T> p = head;
        ListNode<T> q = head;
        while(q != null && q.next != null){
            p= p.next;
            q = q.next.next;
            if(p == q){
                return true;
            }
        }
        return false;
    }

    public int CycleLength(ListNode<T> head){
        ListNode<T> p = head;
        ListNode<T> q = head;
        boolean isCycle = false;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if( p == q) {
                isCycle = true;
                break;
            }
        }
        if(!isCycle)
            return 0;
        else{
            int count = 1;
            p = p.next;
            while( p != q){
                p = p.next;
                count++;
            }
            return count;
        }
    }

    public int FindCycleStartPoint(ListNode<T> head){
        ListNode<T> p = head;
        ListNode<T> q = head;
        boolean isCycle = false;
        while( q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if(p == q){
                isCycle = true;
                break;
            }
        }
        if(!isCycle)
            return -1;
        else{
            p = head;
            int start = 0;
            while( p != q ){
                p = p.next;
                q = q.next;
                start++;
            }
            return start;
        }
    }
}
