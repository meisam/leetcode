package edu.osu.cse.leetcode;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * {@link }
 */
public class Solution1 {
    public int solution(String S) {
        char[] chars = S.toCharArray();
        int n = chars.length;

        int startIndex = 0;

        int maxLength = -1;
        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            char currentChar = chars[currentIndex];
            if (isDigit(currentChar)) {
                startIndex = currentIndex+1;
                continue;
            }
            if (validSubstring(chars, startIndex, currentIndex)) {
                int length = currentIndex - startIndex + 1;
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

    private boolean validSubstring(char[] chars, int startIndex, int endIndex) {
        boolean hasUppercase = false;
        for (int i = startIndex; i <= endIndex; i++) {
            if (isDigit(chars[i])) {
                return false;
            }

            if ('A' <= chars[i] && chars[i] <= 'Z') {
                hasUppercase = true;
            }
        }
        return hasUppercase;
    }

    private boolean isDigit(char aChar) {
        if ('0' <= aChar && aChar <= '9') {
            return true;
        }
        return false;
    }
}
