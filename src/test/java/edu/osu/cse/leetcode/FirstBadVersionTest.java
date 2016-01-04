package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/9/15.
 */
public class FirstBadVersionTest {

    FirstBadVersion solution = new FirstBadVersion();

    @Test
    public void testSingleNoBadVersion() throws Exception {
        solution.versions = new boolean[] {false};
        assertEquals(0, solution.firstBadVersion(solution.versions.length));
    }

    @Test
    public void testSingleAllBadVersion() throws Exception {
        solution.versions = new boolean[] {true};
        assertEquals(1, solution.firstBadVersion(solution.versions.length));
    }

    @Test
    public void testAllBadVersion() throws Exception {
        solution.versions = new boolean[] {true, true, true, true, true, true, true};
        assertEquals(1, solution.firstBadVersion(solution.versions.length));
    }

    @Test
    public void testNoBadVersion() throws Exception {
        solution.versions = new boolean[] {false, false, false, false, false, false, false};
        assertEquals(0, solution.firstBadVersion(solution.versions.length));
    }

    @Test
    public void testLastBadVersion() throws Exception {
        solution.versions = new boolean[] {false, false, false, true};
        assertEquals(4, solution.firstBadVersion(solution.versions.length));
    }

    @Test
    public void testMixedBadVersion() throws Exception {
        solution.versions = new boolean[] {false, false, false, true, true, true, true};
        assertEquals(4, solution.firstBadVersion(solution.versions.length));
    }
}