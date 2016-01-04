package edu.osu.cse.leetcode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

/**
 * Created by fathi on 8/20/15.
 */
public class ReverseBitsTest {

    ReverseBits solution = new ReverseBits();
    Random randomGenerator = new Random();

    @Test
    public void testZero() throws Exception {
        Assert.assertEquals(0, solution.reverseBits(0));
        Assert.assertEquals(43261596, solution.reverseBits(964176192));

        for (int i = 0; i < 10000; i++) {
            Assert.assertEquals(i, solution.reverseBits(solution.reverseBits(i)));
            Assert.assertEquals(-i, solution.reverseBits(solution.reverseBits(-i)));
            int randomInt = randomGenerator.nextInt();
            Assert.assertEquals(randomInt, solution.reverseBits(solution.reverseBits(randomInt)));
        }
    }
}