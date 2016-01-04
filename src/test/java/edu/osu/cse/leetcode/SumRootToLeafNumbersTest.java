package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SumRootToLeafNumbersTest {

    SumRootToLeafNumbers solution = new SumRootToLeafNumbers();

    @Test
    public void testEmpty() {
        SumRootToLeafNumbers.TreeNode emptyNode = null;
        int result = solution.sumNumbers(emptyNode);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testLeafNode() {
        SumRootToLeafNumbers.TreeNode leafNode = new SumRootToLeafNumbers.TreeNode(10);
        int result = solution.sumNumbers(leafNode);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testBalancedFullTree() {
        SumRootToLeafNumbers.TreeNode root = new SumRootToLeafNumbers.TreeNode(1);
        SumRootToLeafNumbers.TreeNode n1 = new SumRootToLeafNumbers.TreeNode(2);
        SumRootToLeafNumbers.TreeNode n2 = new SumRootToLeafNumbers.TreeNode(3);
        SumRootToLeafNumbers.TreeNode n11 = new SumRootToLeafNumbers.TreeNode(4);
        SumRootToLeafNumbers.TreeNode n12 = new SumRootToLeafNumbers.TreeNode(5);
        SumRootToLeafNumbers.TreeNode n21 = new SumRootToLeafNumbers.TreeNode(6);
        SumRootToLeafNumbers.TreeNode n22 = new SumRootToLeafNumbers.TreeNode(7);

        root.left = n1;
        root.right = n2;

        n1.left = n11;
        n1.right = n12;

        n2.left = n21;
        n2.right = n22;

        Assert.assertEquals(4, solution.sumNumbers(n11));
        Assert.assertEquals(5, solution.sumNumbers(n12));
        Assert.assertEquals(6, solution.sumNumbers(n21));
        Assert.assertEquals(7, solution.sumNumbers(n22));
        Assert.assertEquals(24 + 25, solution.sumNumbers(n1));
        Assert.assertEquals(36 + 37, solution.sumNumbers(n2));
        Assert.assertEquals(124 + 125 + 136 + 137, solution.sumNumbers(root));
    }

    @Test
    public void testLinearTree() {
        SumRootToLeafNumbers.TreeNode n = new SumRootToLeafNumbers.TreeNode(1);
        SumRootToLeafNumbers.TreeNode n1 = new SumRootToLeafNumbers.TreeNode(2);
        SumRootToLeafNumbers.TreeNode n11 = new SumRootToLeafNumbers.TreeNode(3);
        SumRootToLeafNumbers.TreeNode n111 = new SumRootToLeafNumbers.TreeNode(4);
        SumRootToLeafNumbers.TreeNode n1111 = new SumRootToLeafNumbers.TreeNode(5);
        SumRootToLeafNumbers.TreeNode n11111 = new SumRootToLeafNumbers.TreeNode(6);

        n.left = n1;
        n.right = null;

        n1.left = n11;
        n1.right = null;

        n11.left = n111;
        n11.right = null;

        n111.left = n1111;
        n111.right = null;

        n1111.left = n11111;
        n1111.right = null;

        Assert.assertEquals(6, solution.sumNumbers(n11111));
        Assert.assertEquals(56, solution.sumNumbers(n1111));
        Assert.assertEquals(456, solution.sumNumbers(n111));
        Assert.assertEquals(3456, solution.sumNumbers(n11));
        Assert.assertEquals(23456, solution.sumNumbers(n1));
        Assert.assertEquals(23456, solution.sumNumbers(n1));
        Assert.assertEquals(123456, solution.sumNumbers(n));
    }

    @Test
    public void testBilateralTree() {
        SumRootToLeafNumbers.TreeNode n = new SumRootToLeafNumbers.TreeNode(1);
        SumRootToLeafNumbers.TreeNode n1 = new SumRootToLeafNumbers.TreeNode(2);
        SumRootToLeafNumbers.TreeNode n11 = new SumRootToLeafNumbers.TreeNode(3);
        SumRootToLeafNumbers.TreeNode n111 = new SumRootToLeafNumbers.TreeNode(4);
        SumRootToLeafNumbers.TreeNode n1111 = new SumRootToLeafNumbers.TreeNode(5);
        SumRootToLeafNumbers.TreeNode n11111 = new SumRootToLeafNumbers.TreeNode(6);

        n1.left = n11;
        n1.right = null;

        n11.left = n111;
        n11.right = null;

        n111.left = n1111;
        n111.right = null;

        n1111.left = n11111;
        n1111.right = null;

        SumRootToLeafNumbers.TreeNode n2 = new SumRootToLeafNumbers.TreeNode(5);
        SumRootToLeafNumbers.TreeNode n22 = new SumRootToLeafNumbers.TreeNode(6);
        SumRootToLeafNumbers.TreeNode n222 = new SumRootToLeafNumbers.TreeNode(7);
        SumRootToLeafNumbers.TreeNode n2222 = new SumRootToLeafNumbers.TreeNode(8);
        SumRootToLeafNumbers.TreeNode n22222 = new SumRootToLeafNumbers.TreeNode(9);

        n2.right = n22;
        n2.left = null;

        n22.right = n222;
        n22.left = null;

        n222.right = n2222;
        n222.left = null;

        n2222.right = n22222;
        n2222.left = null;

        n.right = n1;
        n.left = n2;

        Assert.assertEquals(6, solution.sumNumbers(n11111));
        Assert.assertEquals(56, solution.sumNumbers(n1111));
        Assert.assertEquals(456, solution.sumNumbers(n111));
        Assert.assertEquals(3456, solution.sumNumbers(n11));
        Assert.assertEquals(23456, solution.sumNumbers(n1));

        Assert.assertEquals(9, solution.sumNumbers(n22222));
        Assert.assertEquals(89, solution.sumNumbers(n2222));
        Assert.assertEquals(789, solution.sumNumbers(n222));
        Assert.assertEquals(6789, solution.sumNumbers(n22));
        Assert.assertEquals(56789, solution.sumNumbers(n2));

        Assert.assertEquals(123456 + 156789, solution.sumNumbers(n));
    }
}
