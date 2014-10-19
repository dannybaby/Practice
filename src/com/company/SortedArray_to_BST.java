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
public class SortedArray_to_BST {
    public BiTreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
            return null;
        else
            return ArrayToBST(num, 0, num.length - 1);
    }
    
    public BiTreeNode ArrayToBST(int[] num, int start, int end){
        if(start > end)
            return null;
        int mid = (int)(start + end)/2;
        BiTreeNode root = new BiTreeNode(num[mid]);
        root.left = ArrayToBST(num, start, mid-1);
        root.right = ArrayToBST(num, mid+1, end);
        return root;
    }    
}
