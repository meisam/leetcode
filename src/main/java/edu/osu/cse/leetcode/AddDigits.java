package edu.osu.cse.leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * @see <a href="https://leetcode.com/problems/add-digits/">Add Digits</a>
 * {@link }
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }

}
