package edu.osu.cse.leetcode;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * <p>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * For example,
 * <p>
 * {@code
 * 1
 * / \
 * 2   3
 * }
 * <p>
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * <p>
 * Return the sum = 12 + 13 = 25.
 *
 * @see <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers">SumRootToLeafNumbers</a>
 */
public class SumRootToLeafNumbers {

    int totalSum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.val;

        totalSum = 0;
        sumChild(0, root);
        return totalSum;
    }

    public void sumChild(int parentNumber, TreeNode child) {
        assert (child != null);

        int currentNumber = parentNumber * 10 + child.val;

        if (child.left != null) {
            sumChild(currentNumber, child.left);
        }
        if (child.right != null) {
            sumChild(currentNumber, child.right);
        }

        if (child.left == null && child.right == null) {
            this.totalSum += currentNumber;
        }
    }

    /**
     * Created by fathi on 8/20/15.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
