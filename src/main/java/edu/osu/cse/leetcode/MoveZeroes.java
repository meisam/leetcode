package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int n = nums.length;
        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            int currentElement = nums[currentIndex];
            if (currentElement == 0) {
                zeroCount++;
            } else {
                nums[currentIndex - zeroCount] = currentElement;
            }
        }

        if (zeroCount > 0) {
            Arrays.fill(nums, n - zeroCount, n, 0);
        }
    }
}
