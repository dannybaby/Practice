package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ydeng on 11/11/2014.
 */
public class Sum_Root_to_Leaf_Numbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int sumNumbers(TreeNode root) {
        int res = 0;
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> s = new LinkedList<Integer>();
        q.offer(root);
        s.offer(0);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            int sum = s.poll();
            if(cur.left == null && cur.right == null){
                res = res + sum * 10 + cur.val;
            }
            if(cur.left != null){
                q.offer(cur.left);
                s.offer(sum*10 + cur.val);
            }
            if(cur.right != null){
                q.offer(cur.right);
                s.offer(sum*10 + cur.val);
            }
        }
        return res;
    }
}
