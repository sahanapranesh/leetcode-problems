package com.leetcode.problems.easy;


public class LeafSimilarTrees {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder leafSequence1 = new StringBuilder("");
        findLeafNodes(root1, leafSequence1);
        return leafSequence1.isEmpty();
    }

    public void findLeafNodes(TreeNode root1, StringBuilder leafSequence){
        if(root1 == null){
            return;
        }
        if(root1.left == null && root1.right==null){
            leafSequence.append(root1.val);
        }
        else{
            findLeafNodes(root1.left, leafSequence);
            findLeafNodes(root1.right, leafSequence);
        }
    }
}
