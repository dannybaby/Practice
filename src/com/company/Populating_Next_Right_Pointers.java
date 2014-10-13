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
import java.util.LinkedList;
import java.util.Queue;
public class Populating_Next_Right_Pointers {
    private class TreeLinkNode{
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) {val = x;}
    }
    public void connect(TreeLinkNode root){
        if(root !=null){
            Queue<TreeLinkNode> tmp = new LinkedList<TreeLinkNode>();
            TreeLinkNode node = root;
            TreeLinkNode pre = null;
            tmp.add(node);
            int count = 0;
            while(!tmp.isEmpty()){
                node = tmp.remove();
                count++;
                if(node.left != null)
                    tmp.add(node.left);
                if(node.right != null)
                    tmp.add(node.right);
                if((count & (count -1)) !=0)
                    pre.next = node;
                pre = node;
            }
        }
    }
    
    public void connect2(TreeLinkNode root){
        if(root == null)
            return;
        TreeLinkNode cur = root;
        TreeLinkNode tmp = null;
        while( cur.left != null){
            tmp = cur;
            while(tmp != null){
                tmp.left.next = tmp.right;
                if(tmp.next != null)
                    tmp.right.next = tmp.next.left;
                tmp = tmp.next;
            }
            cur = cur.left;
        }            
    }
}
