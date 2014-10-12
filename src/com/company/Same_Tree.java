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
public class Same_Tree {
    public boolean isSameTree(BiTreeNode p, BiTreeNode q){
        if (p == null || q == null)
            return p == q;
        else{
            return (p.val == q.val) && (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
        }
    }
}
