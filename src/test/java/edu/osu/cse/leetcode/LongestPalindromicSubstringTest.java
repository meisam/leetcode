package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */
public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindrome() throws Exception {
        assertEquals("", solution.longestPalindrome(""));
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("aaa", solution.longestPalindrome("aaa"));
        assertEquals("aaa", solution.longestPalindrome("caaab"));
        assertEquals("abcdefggfedcba", solution.longestPalindrome("abcdefggfedcba"));
        assertEquals("abcdefggfedcba", solution.longestPalindrome("12344321XXabcdefggfedcba"));
    }
}