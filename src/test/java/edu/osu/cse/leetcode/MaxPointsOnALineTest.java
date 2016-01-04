package edu.osu.cse.leetcode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/19/15.
 */
public class MaxPointsOnALineTest {

    MaxPointsOnALine solution = new MaxPointsOnALine();

    @Test
    public void testMaxPoints() throws Exception {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),

                new Point(-1, 9),
                new Point(0, 6),
                new Point(1, 3),
                new Point(2, 0),
                new Point(3, -3),
                new Point(4, -6),
                new Point(5, -9),

                new Point(2, 3),
                new Point(80, 1),
                new Point(90, 0)
        };

        assertEquals(7, solution.maxPoints(points));
    }

    @Test
    public void testOnePoint() throws Exception {
        Point[] points = new Point[]{
                new Point(1, 1)
        };

        assertEquals(1, solution.maxPoints(points));
    }

    @Test
    public void testTwoPoints() throws Exception {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(1, 1)
        };

        assertEquals(2, solution.maxPoints(points));
    }

    @Test
    public void testSamePoints() throws Exception {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0)
        };

        assertEquals(4, solution.maxPoints(points));
    }

    @Test
    public void testSamePointsWithOneExtra() throws Exception {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0),

                new Point(1, 1)
        };

        assertEquals(5, solution.maxPoints(points));
    }

    @Test
    public void testSamePointsWithTwoExtra() throws Exception {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0),
                new Point(0, 0),

                new Point(2, 5),
                new Point(1, 1)
        };

        assertEquals(5, solution.maxPoints(points));
    }

    @Test
    public void testManyPoints() throws Exception {
        Point[] points = new Point[]{
                new Point(-105, -467),
                new Point(-115, -341),
                new Point(-135, -613),
                new Point(-150, -686),
                new Point(-161, -481),
                new Point(-184, -551),
                new Point(-230, -691),
                new Point(-30, -102),
                new Point(-60, -248),
                new Point(-90, -394),
                new Point(0, 9),
                new Point(115, 359),
                new Point(115, 359),
                new Point(135, 701),
                new Point(138, 429),
                new Point(150, 774),
                new Point(207, 639),
                new Point(23, 79),
                new Point(230, 709),
                new Point(60, 336),
                new Point(92, 289)
        };

        assertEquals(5, solution.maxPoints(points)

        );
    }
}