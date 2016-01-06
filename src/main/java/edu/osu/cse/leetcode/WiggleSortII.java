package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 * <p>
 * Example:
 * (1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
 * (2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].
 * <p>
 * Note:
 * You may assume all input has valid answer.
 * <p>
 * Follow Up:
 * Can you do it in O(n) time and/or in-place with O(1) extra space?
 *
 * @see <a href="https://leetcode.com/problems/wiggle-sort-ii/">Wiggle Sort II</a>
 * {@link }
 */
public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int mid = n / 2 - (n % 2 == 0 ? 1 : 0);
        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);

        for (int i = 0, copyOffset = 0; copyOffset <= mid; copyOffset++, i += 2) {
            nums[i] = sorted[mid - copyOffset];
            if (i + 1 < n)
                nums[i + 1] = sorted[n - copyOffset - 1];
        }
    }

}
