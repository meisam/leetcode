package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class RegularExpressionMatchingTest {

    RegularExpressionMatching solution = new RegularExpressionMatching();

    @Test
    public void testReverse() throws Exception {
        assertFalse(solution.isMatch("", "a"));
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aa", ".*"));
        assertTrue(solution.isMatch("ab", ".*"));
        assertTrue(solution.isMatch("aab", "c*a*b"));
        assertFalse(solution.isMatch("aa", "a"));
        assertFalse(solution.isMatch("aaa", "aa"));
    }

    @Test
    public void testComplicated() {
        assertTrue(solution.isMatch("aab", "c*a*b*"));
        assertTrue(solution.isMatch("aab", "c*a*a*x*f*b*d*n*"));
        assertTrue(solution.isMatch("aab", "c*a*x*b*x*"));
        assertFalse(solution.isMatch("aaa", "ab*a"));

    }

    @Test
    public void testMatchChar() {
        assertTrue('c' == '.' || 'c' == 'c');
        assertTrue('.' == '.' || '.' == 'c');
    }


}