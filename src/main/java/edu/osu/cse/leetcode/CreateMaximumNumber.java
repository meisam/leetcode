package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * Given two arrays of length m and n with digits 0-9 representing two numbers.
 * Create the maximum number of length k <= m + n from digits of the two.
 * The relative order of the digits from the same array must be preserved.
 * Return an array of the k digits. You should try to optimize your time and space complexity.
 * <p>
 * Example 1:
 * nums1 = [3, 4, 6, 5]
 * nums2 = [9, 1, 2, 5, 8, 3]
 * k = 5
 * return [9, 8, 6, 5, 3]
 * <p>
 * Example 2:
 * nums1 = [6, 7]
 * nums2 = [6, 0, 4]
 * k = 5
 * return [6, 7, 6, 0, 4]
 * <p>
 * Example 3:
 * nums1 = [3, 9]
 * nums2 = [8, 9]
 * k = 3
 * return [9, 8, 9]
 *
 * @see <a href="https://leetcode.com/problems/create-maximum-number/">Create Maximum Number</a>
 * {@link }
 */
public class CreateMaximumNumber {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int K = k;

        int[][][][] memo = new int[m + 1][n + 1][k + 1][k];
        boolean[][][] computed = new boolean[m + 1][n + 1][k + 1];
        return maxNumber(nums1, 0, nums2, 0, K, k, memo, computed);
    }

    private int[] maxNumber(int[] nums1, int index1, int[] nums2, int index2, int K, int k, int[][][][] memo, boolean[][][] computed) {

        if (k == 0 || k > (nums1.length - index1) + (nums2.length - index2)) {
            return null;
        }

        if (computed[index1][index2][k]) {
            return memo[index1][index2][k];
        }

        int[] bestNumber = null;

        if (index1 < nums1.length) {
            bestNumber = max(bestNumber,
                    replaceDigit(maxNumber(nums1, index1 + 1, nums2, index2, K, k - 1, memo, computed), K, K - k, nums1[index1]));
            bestNumber = max(bestNumber
                    , maxNumber(nums1, index1 + 1, nums2, index2, K, k, memo, computed)
            );
        }

        if (index2 < nums2.length) {
            bestNumber = max(bestNumber
                    , replaceDigit(maxNumber(nums1, index1, nums2, index2 + 1, K, k - 1, memo, computed), K, K - k, nums2[index2]));
            bestNumber = max(bestNumber
                    , maxNumber(nums1, index1, nums2, index2 + 1, K, k, memo, computed)
            );

        }

        memo[index1][index2][k] = bestNumber;
        computed[index1][index2][k] = true;
        return bestNumber;
    }

    private int[] max(int[] v1, int[] v2) {
        if (v1 == null)
            return v2;
        if (v2 == null)
            return v1;
        assert v1.length == v2.length;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i])
                continue;
            return (v1[i] > v2[i]) ? v1 : v2;
        }
        return v1; // the numbers are equal, so just return the first one
    }

    private int[] replaceDigit(int[] num, int k, int index, int digit) {

        int[] result = num == null ? new int[k] : Arrays.copyOf(num, k);
        if (result[0] == -1) {
            Arrays.fill(result, 0);
        }
        result[index] = digit;
        return result;
    }

}
