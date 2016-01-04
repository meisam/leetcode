package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/8/15.
 */
public class HIndexTest {

    HIndex solution = new HIndex();

    @Test
    public void testHIndex() throws Exception {
        Assert.assertEquals(3, solution.hIndex(new int[]{3, 0, 6, 1, 5}));
        Assert.assertEquals(3, solution.hIndex(new int[]{0, 3, 6, 1, 5}));
        Assert.assertEquals(0, solution.hIndex(new int[]{0}));
        Assert.assertEquals(1, solution.hIndex(new int[]{1}));
        Assert.assertEquals(1, solution.hIndex(new int[]{10}));
        Assert.assertEquals(2, solution.hIndex(new int[]{10, 10}));
        Assert.assertEquals(3, solution.hIndex(new int[]{10, 10, 3}));
        Assert.assertEquals(3, solution.hIndex(new int[]{10, 10, 5}));
    }
}