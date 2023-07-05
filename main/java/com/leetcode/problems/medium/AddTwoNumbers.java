package com.leetcode.problems.medium;

public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     */
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        return addNumbers(l1, l2, carry);
    }

    private ListNode addNumbers(ListNode l1, ListNode l2, int carry ) {
        ListNode tempResult = null;
        if(l1!=null || l2!=null) {
            int currentValue = (l1!=null? l1.val: 0) + (l2!=null? l2.val:0) + carry;
            tempResult = new ListNode(currentValue);
            if (currentValue >= 10) {
                tempResult.val = currentValue % 10;
                carry = currentValue / 10;
            }
            l1 = l1.next;
            l2 = l2.next;
            tempResult.next = addNumbers(l1, l2, carry);
        }
        return tempResult;
    }


}
