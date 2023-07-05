package com.leetcode.problems;

import com.sun.source.tree.Tree;

public class SortedArrayToBST {
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

    public static TreeNode sortedArrayToBST(int[] nums) {
        return insertIntoBST(nums, 0, nums.length-1);
    }

    private static TreeNode insertIntoBST(int[] nums, int low, int high) {
        if(low > high){
            return null;
        }
        int mid = (high+low)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = insertIntoBST(nums,low,mid-1);
        treeNode.right = insertIntoBST(nums,mid+1,high);
        return treeNode;
    }

    public static void main(String[] args) {
       TreeNode treeNode = sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(treeNode);
    }
}
