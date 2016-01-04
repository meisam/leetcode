package edu.osu.cse.leetcode;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 * <p>
 *
 * @see <a href="https://leetcode.com/problems/missing-number">Missing Number</a>
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = 0;
        int stride = 4;
        int upLimit = n - n % stride;
        for (int i = 0; i < upLimit; i += stride) {
            sum += nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
        }

        for (int i = upLimit; i < n; i++) {
            sum += nums[i];
        }

        int expectedSum = ((1 + n) * n) >> 1;
        return (expectedSum - sum);
    }
}
