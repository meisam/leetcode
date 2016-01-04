package edu.osu.cse.leetcode;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * {@link }
 */
public class Solution3 {
    public int solution(String S) {
        String[] lines = S.split("\\n");

        int[] durationsInSecond = extractDuration(lines);
        return 0;
    }

    private int[] extractDuration(String[] lines) {
        int[] durations = new int[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String[] fields = lines[i].split(":");
            int hours = Integer.parseInt(fields[0]);
            int minutes = Integer.parseInt(fields[0]);
            int seconds = Integer.parseInt(fields[0]);
        }
        return null;
    }
}
