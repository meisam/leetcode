package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 10/23/15.
 */
public class Solution1Test {

    Solution1 solution1 = new Solution1();

    @Test
    public void testSolution1() {
        assertEquals(2, solution1.solution("a0Ba"));
        assertEquals(-1, solution1.solution("a0bb"));
        assertEquals(-1, solution1.solution(""));
        assertEquals(-1, solution1.solution("a"));
        assertEquals(1, solution1.solution("A"));
        assertEquals(-1, solution1.solution("0"));
        assertEquals(23, solution1.solution("AAAAAAAAAAAAAAAAAAAAAAA"));
        assertEquals(-1, solution1.solution("aaaaaaaaa"));
    }

}