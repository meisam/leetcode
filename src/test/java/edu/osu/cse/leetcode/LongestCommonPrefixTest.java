package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 8/26/15.
 */
public class LongestCommonPrefixTest {

    LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    public void testEmptyString() {
        String[] strs1 = {"AAAA", "AAA", "AA"};
        Assert.assertEquals("AA", solution.longestCommonPrefix(strs1));

        String[] strs2 = {"AAAA", "A", "AAAAA"};
        Assert.assertEquals("A", solution.longestCommonPrefix(strs2));

        String[] strs3 = {"AAAA", "", "AAAAA"};
        Assert.assertEquals("", solution.longestCommonPrefix(strs3));

        String[] strs4 = {"AAAAAAA"};
        Assert.assertEquals("AAAAAAA", solution.longestCommonPrefix(strs4));

        String[] strs5 = {};
        Assert.assertEquals("", solution.longestCommonPrefix(strs5));

        String[] strs6 = {"A", "B"};
        Assert.assertEquals("", solution.longestCommonPrefix(strs6));
    }

}