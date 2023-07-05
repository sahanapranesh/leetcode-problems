package com.leetcode.problems.medium;


import org.junit.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void testSolution() {
        AddTwoNumbers.ListNode l1 = getFirstList(2, 4, 3);
        AddTwoNumbers.ListNode l2 = getFirstList(5, 6, 4);
        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
    }

    private AddTwoNumbers.ListNode getFirstList(int a, int b, int c) {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode(a);
        AddTwoNumbers.ListNode second = new AddTwoNumbers.ListNode(b);
        listNode.next = second;
        AddTwoNumbers.ListNode third = new AddTwoNumbers.ListNode(c);
        second.next = third;
        return listNode;
    }

}