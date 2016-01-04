package edu.osu.cse.leetcode;

/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers">Two Sum</a>
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstDigit = new ListNode(-1);
        ListNode lastDigit = firstDigit;

        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int d1 = (l1 == null ? 0 : l1.val);
            if (l1 != null) {
                l1 = l1.next;
            }

            int d2 = (l2 == null ? 0 : l2.val);
            if (l2 != null) {
                l2 = l2.next;
            }

            int d = (d1 + d2 + carry) % 10;
            carry = (d1 + d2 + carry) / 10;

            ListNode currentDigit = new ListNode(d);
            lastDigit.next = currentDigit;

            lastDigit = currentDigit;
        }

        return firstDigit.next;
    }

    /**
     * Definition for singly-linked list.
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}

