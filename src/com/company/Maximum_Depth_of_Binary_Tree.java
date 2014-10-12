/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author newstar
 * @param <T>
 */
public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(BiTreeNode root){
        if(root == null)
            return 0;
        else{
            int a = maxDepth(root.left);
            int b = maxDepth(root.right);
            return 1 + (a>b?a:b);
        }
    }
}
