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
    public void connect3(TreeLinkNode root) {
        TreeLinkNode p = root;
        TreeLinkNode node = root;
        TreeLinkNode cur = root;
        while(p != null){
            cur = p;
            p = getchild(cur);
            node = cur.next;
            while(node != null){
                TreeLinkNode tmp = getchild(node);
                if(tmp != null){
                    if(p == null){
                        p = tmp;
                    }
                    else{
                        getrchild(cur).next = tmp;
                    }
                    cur = node;
                }
                node = node.next;
            }
        }
    }
    
    public TreeLinkNode getchild(TreeLinkNode root){
        if(root.right == null && root.left == null)
            return null;
        else if(root.right == null && root.left !=null)
            return root.left;
        else if(root.left == null && root.right != null)
            return root.right;
        else{
            root.left.next = root.right;
            return root.left;
        }
    }
    public TreeLinkNode getrchild(TreeLinkNode root){
        if(root.right == null && root.left !=null)
            return root.left;
        else
            return root.right;
    }
}
