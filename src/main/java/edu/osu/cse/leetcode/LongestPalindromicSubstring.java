package edu.osu.cse.leetcode;

/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">Longest Palindromic Substring</a>
 * {@link }
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        int n = s.length();

        if (n == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        int maxStart = 0;
        int maxEnd = 0;
        int maxLength = maxStart - maxEnd + 1;
        for (int start = 0; start < n; ++start) {
            for (int end = n - 1; (end >= start); --end) {
                int length = end - start + 1;
                if (length < maxLength)
                    break;

                if (isPalindromic(chars, start, end)) {
                    maxStart = start;
                    maxEnd = end;
                    maxLength = length;
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }

    private boolean isPalindromic(char[] chars, int start, int end) {
        assert start <= end;

        for (int i = start; i <= (start + end) / 2; i++) {
            int j = end - (i - start);
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}

