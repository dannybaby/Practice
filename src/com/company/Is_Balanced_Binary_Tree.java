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
public class Is_Balanced_Binary_Tree {
    public boolean isBalanced(BiTreeNode root) {
        if(root == null)
            return true;
        return getHeight(root) != -1;
    }
    public int getHeight(BiTreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if( l == -1 || r == -1 || Math.abs(l -r) > 1)
            return -1;
        else
            return 1+Math.max(l,r);
    }    
}
