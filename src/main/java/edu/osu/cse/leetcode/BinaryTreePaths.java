package edu.osu.cse.leetcode;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * For example, given the following binary tree:
 * <p>
 * <pre>
 * {@code
 *
 *    1
 *  /  \
 * 2    3
 * \
 *  5
 * }
 * </pre>
 * All root-to-leaf paths are:
 * <p>
 * ["1->2->5", "1->3"]
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-paths/">Binary Tree Paths</a>
 * {@link }
 */
public class BinaryTreePaths {

    public int addDigits(int num) {
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }

}
