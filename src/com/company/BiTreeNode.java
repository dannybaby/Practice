/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 * Definition of Binary Tree Node
 * @author newstar
 * @param <T> Type of the value
 */
public class BiTreeNode<T> {
    T val;
    BiTreeNode<T> left;
    BiTreeNode<T> right;
    public BiTreeNode(){}
    public BiTreeNode(T x){val = x;}
}
