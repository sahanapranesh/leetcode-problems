package com.leetcode.problems;

public class ReverseLinkedList {
        public MergeTwoSortedLists.ListNode reverseList(MergeTwoSortedLists.ListNode head) {
            MergeTwoSortedLists.ListNode prev = null;
            while(head!=null){
                MergeTwoSortedLists.ListNode nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            }
            return prev;

    }
}
