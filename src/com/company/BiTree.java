/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author danny
 * @param <T> Type of the value in the tree
 * e.g {a,b,c,#,#,e}
 */
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class BiTree<T> {
    BiTreeNode<T> root;
    public BiTree(){}
    public BiTree(BiTreeNode<T> x) {root = x;}
    public BiTreeNode<T> createTree( T Nodes[],int start){
        if ((start -1) >= Nodes.length)
            return null;
        else if(Nodes[start - 1] == "#")
            return null;
        else{
            BiTreeNode<T> node = new BiTreeNode<T>((T)Nodes[start -1]);
            node.left = createTree(Nodes, start * 2 );
            node.right = createTree(Nodes, start * 2 + 1 );
            return node;
        }
    }
    
    public void buildTree(T Nodes[]){
        if (Nodes.length == 0)
            this.root = null;
        else{
            root = createTree(Nodes, 1);
        }            
    }
    
    public void preOrderTraverse(){
        Stack< BiTreeNode<T> > tmp = new Stack< BiTreeNode<T> >();
        BiTreeNode<T> node = root;
        while (node != null || !tmp.isEmpty()){
            while (node != null) {
                tmp.push(node);
                System.out.println(node.val);
                node = node.left;
            }
            node = tmp.pop();
            node = node.right;
        }
    }
    
    public void inOrderTraverse(){
        Stack< BiTreeNode<T> > tmp = new Stack< BiTreeNode<T> >();
        BiTreeNode<T> node = root;
        while (node != null || !tmp.isEmpty()){
            while (node != null){
                tmp.push(node);
                node = node.left;
            }
            node = tmp.pop();
            System.out.println(node.val);
            node = node.right;
        }
    }
    
    public void postOrderTraverse(){
        Stack< BiTreeNode<T> > tmp  = new Stack< BiTreeNode<T> >();
        BiTreeNode<T> node = root;
        tmp.push(node);
        BiTreeNode<T> pre = null;
        while (!tmp.isEmpty()){
            node = tmp.lastElement();
            if((node.left == null && node.right == null) || ( pre != null &&(pre ==node.left || pre == node.right))){
                System.out.println(node.val);
                pre = node;
                tmp.pop();
            }
            else{
                if(node.right != null)
                    tmp.push(node.right);
                if(node.left != null)
                    tmp.push(node.left);                
            }
        }
    }

}
