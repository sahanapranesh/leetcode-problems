package com.leetcode.problems;

import com.sun.source.tree.Tree;

public class MaximumDepthBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        System.out.println(maxDepth(root.left));
        System.out.println(maxDepth(root.right));
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public void test(){

    }
}
