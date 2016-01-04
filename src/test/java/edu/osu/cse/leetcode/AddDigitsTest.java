package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 8/26/15.
 */
public class AddDigitsTest {

    AddDigits solution = new AddDigits();

    @Test
    public void testAddDigits() throws Exception {
        Assert.assertEquals(2, solution.addDigits(38));

        Assert.assertEquals(1, solution.addDigits(1));
        Assert.assertEquals(2, solution.addDigits(2));
        Assert.assertEquals(3, solution.addDigits(3));
        Assert.assertEquals(4, solution.addDigits(4));
        Assert.assertEquals(5, solution.addDigits(5));
        Assert.assertEquals(6, solution.addDigits(6));
        Assert.assertEquals(7, solution.addDigits(7));
        Assert.assertEquals(8, solution.addDigits(8));
        Assert.assertEquals(9, solution.addDigits(9));
        Assert.assertEquals(1, solution.addDigits(10));

        Assert.assertEquals(1, solution.addDigits(1000));
        Assert.assertEquals(1, solution.addDigits(1000));
        Assert.assertEquals(9, solution.addDigits(123456789));

        Assert.assertEquals(9, solution.addDigits(9));
        Assert.assertEquals(9, solution.addDigits(99));
        Assert.assertEquals(9, solution.addDigits(999));
        Assert.assertEquals(9, solution.addDigits(9999));
        Assert.assertEquals(9, solution.addDigits(99999));

    }
}