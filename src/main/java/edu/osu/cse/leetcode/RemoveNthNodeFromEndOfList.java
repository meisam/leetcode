package edu.osu.cse.leetcode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">Remove Nth Node From End of List</a>
 * {@link }
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;

        for (int i = 0; i < n; i++) {
            if (currentNode == null) {
                break;
            }
            currentNode = currentNode.next;
        }

        ListNode nodeToRemove = head;
        ListNode previousNode = new ListNode(0); // a dummy node
        previousNode.next = nodeToRemove;
        while (currentNode != null) {
            currentNode = currentNode.next;
            previousNode = previousNode.next;
            nodeToRemove = nodeToRemove.next;
        }

        if (nodeToRemove == head)
            return head.next;

        previousNode.next = nodeToRemove.next;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

