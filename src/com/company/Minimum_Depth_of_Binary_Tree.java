package com.company;

import java.util.Queue;

/**
 * Created by ydeng on 11/11/2014.
 */
public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(BiTreeNode root) {
        if(root == null)
            return 0;
        Queue<BiTreeNode> q = new LinkedList<BiTreeNode>();
        q.offer(root);
        q.offer(null);
        int level = 1;
        while(!q.isEmpty()){
            BiTreeNode cur = q.poll();
            if(cur == null){
                level++;
                q.offer(null);
            }
            else if(cur.left == null && cur.right == null){
                return level;
            }
            else{
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
            }
        }
        return level;
    }
}
