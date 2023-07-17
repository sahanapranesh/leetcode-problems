package com.leetcode.problems.medium;

/**
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 *
 * Return the number of good nodes in the binary tree.
 */
public class CountGoodNodesBinaryTree {

    public class TreeNode {
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

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode root, int min) {
        if (root == null) {
            return 0;
        }
        int result = root.val >= min ? 1 : 0;
        result += dfs(root.left, Math.max(root.val, min));
        result += dfs(root.right, Math.max(root.val, min));
        return result;
    }

}
