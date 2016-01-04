package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fathi on 8/25/15.
 */
public class UglyNumberTest {
    UglyNumber solution = new UglyNumber();

    @Test
    public void test1() {

        Assert.assertTrue(solution.isUgly(2));
        Assert.assertTrue(solution.isUgly(3));
        Assert.assertTrue(solution.isUgly(5));
        Assert.assertTrue(solution.isUgly(2 * 2));
        Assert.assertTrue(solution.isUgly(3 * 3 * 3));
        Assert.assertTrue(solution.isUgly(2 * 3 * 5));

        // not ugly
        Assert.assertFalse(solution.isUgly(2 * 3 * 7));
        Assert.assertFalse(solution.isUgly(14));

    }

}