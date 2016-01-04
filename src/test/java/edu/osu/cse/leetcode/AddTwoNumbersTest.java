package edu.osu.cse.leetcode;

import org.junit.Test;
import edu.osu.cse.leetcode.AddTwoNumbers.ListNode;

import static org.junit.Assert.*;

/**
 */
public class AddTwoNumbersTest {

    AddTwoNumbers solution = new AddTwoNumbers();

    void assertListsEqual(ListNode expected, ListNode actual) {
        if (expected == null && actual == null) {
            return;
        }

        int position = 0;
        while (expected != null && actual != null) {
            assertEquals(String.format("at position %d expected = %d != %d = actual.", position, expected.val, actual.val)
                    , expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
            position++;
        }

        if (expected != null) {
            fail(String.format("actual results are shorter that expected: expected[%d]=%d",
                    position, expected.val));
        }
        if (actual != null) {
            fail(String.format("actual results are longer that expected: actual[%d]=%d",
                    position, actual.val));
        }
    }


    ListNode digitsToList(int... digits) {
        if (digits.length == 0) {
            return null;
        }
        ListNode head = new ListNode(digits[0]);
        ListNode curListNode = head;
        for (int i = 1; i < digits.length; i++) {
            curListNode.next = new ListNode(digits[i]);
            curListNode = curListNode.next;
        }
        return head;
    }

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = digitsToList(2, 4, 3);
        ListNode l2 = digitsToList(5, 6, 4);

        ListNode expectedResult = digitsToList(7, 0, 8);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddShortLongNumbers() {
        ListNode l1 = digitsToList(2);
        ListNode l2 = digitsToList(5, 6, 4, 8, 9);

        ListNode expectedResult = digitsToList(7, 6, 4, 8, 9);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddShortLongWithCarryNumbers() {
        ListNode l1 = digitsToList(8);
        ListNode l2 = digitsToList(5, 6, 4, 8, 9);

        ListNode expectedResult = digitsToList(3, 7, 4, 8, 9);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddLongtLongNumbers() {
        ListNode l1 = digitsToList(5, 6, 4, 8, 9);
        ListNode l2 = digitsToList(2);

        ListNode expectedResult = digitsToList(7, 6, 4, 8, 9);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddLongShortWithCarryNumbers() {
        ListNode l1 = digitsToList(5, 6, 4, 8, 9);
        ListNode l2 = digitsToList(8);

        ListNode expectedResult = digitsToList(3, 7, 4, 8, 9);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddSparseNumbers() {
        ListNode l1 = digitsToList(0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        ListNode l2 = digitsToList(0, 0, 0, 0, 0, 1);

        ListNode expectedResult = digitsToList(0, 0, 0, 0, 0, 1, 0, 0, 0, 1);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAddSparseWithCarryNumbers() {
        ListNode l1 = digitsToList(0, 0, 0, 0, 0, 8, 0, 0, 0, 1);
        ListNode l2 = digitsToList(0, 0, 0, 0, 0, 8);

        ListNode expectedResult = digitsToList(0, 0, 0, 0, 0, 6, 1, 0, 0, 1);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAdd_1_99() {
        ListNode l1 = digitsToList(1);
        ListNode l2 = digitsToList(9, 9);

        ListNode expectedResult = digitsToList(0, 0, 1);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAdd_1_999999999() {
        ListNode l1 = digitsToList(1);
        ListNode l2 = digitsToList(9, 9, 9, 9, 9, 9, 9, 9, 9);

        ListNode expectedResult = digitsToList(0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void testAdd_2_98() {
        ListNode l1 = digitsToList(2);
        ListNode l2 = digitsToList(8, 9);

        ListNode expectedResult = digitsToList(0, 0, 1);
        assertListsEqual(expectedResult, solution.addTwoNumbers(l1, l2));
    }

}