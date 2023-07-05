package com.leetcode.problems;

import java.util.List;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoListsIterativeWay(ListNode list1, ListNode list2) {
            ListNode result = new ListNode();
            ListNode dummy = result;
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    dummy.next = list1;
                    list1 = list1.next;
                } else {
                    dummy.next = list2;
                    list2 = list2.next;
                }
                dummy = dummy.next;
            }
            if (list1 != null) {
                dummy.next = list1;
            } else if (list2 != null) {
                dummy.next = list2;
            }
            return result.next;
        }
    }

    public ListNode mergeTwoListsRecursiveWay(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result;
        if (list1.val < list2.val) {
            result = list1;
            result.next = mergeTwoListsRecursiveWay(list1.next, list2);
        }
        else{
            result = list2;
            result.next = mergeTwoListsRecursiveWay(list1, list2.next);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2, new ListNode(3));
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3, new ListNode(4));
        System.out.println();
    }
}
