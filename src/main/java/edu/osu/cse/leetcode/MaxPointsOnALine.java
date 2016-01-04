package edu.osu.cse.leetcode;

import java.util.Hashtable;
import java.util.Map;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 * <p>
 *
 * @see <a href="https://leetcode.com/problems/max-points-on-a-line">Max Points on a Line</a>
 */
public class MaxPointsOnALine {

    public class HashablePoint extends Point {

        HashablePoint(Point p) {
            super(p.x, p.y);
        }

        @Override
        public int hashCode() {
            return (x + 7) * 13 + (y + 11);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Point) {
                Point other = (Point) obj;
                return (this.x == other.x) && (this.y == other.y);
            }
            return false;
        }
    }

    public int maxPoints(Point[] points) {

        if (points.length <= 2)
            return points.length;

        Map<HashablePoint, Integer> identicalPointsCount = new Hashtable<>(points.length * 2);

        for (Point point : points) {
            HashablePoint x = new HashablePoint(point);
            int counts = identicalPointsCount.getOrDefault(x, 0);
            identicalPointsCount.put(x, counts + 1);
        }

        int n = identicalPointsCount.size();
        if (n <= 2) {
            return points.length;
        }

        HashablePoint[] uniquePoints = new HashablePoint[identicalPointsCount.size()];
        uniquePoints = identicalPointsCount.keySet().toArray(uniquePoints);

        int totalMax = 0;
        for (int i = 0; i < n - 2; i++) {
            Point x = uniquePoints[i];
            for (int j = i + 1; j < n - 1; j++) {
                Point y = uniquePoints[j];
                int pointsOnXY = identicalPointsCount.get(x) + identicalPointsCount.get(y);
                for (int k = j + 1; k < n; k++) {
                    Point z = uniquePoints[k];
                    if (onSameLine(x, y, z)) {
                        int t = identicalPointsCount.get(z);
                        System.out.printf("%3d: %s, %s, %s --> pointsOnXY = %3d + %3d\n",
                                t + pointsOnXY, x, y, z, pointsOnXY, t);
                        pointsOnXY += identicalPointsCount.get(z);
                    }
                }
                totalMax = Math.max(totalMax, pointsOnXY);
            }

        }

        return totalMax;
    }

    boolean samePoint(Point p1, Point p2) {
        return (p1.x == p2.x && p1.y == p2.y);
    }

    boolean onSameLine(Point p1, Point p2, Point p3) {
        if (samePoint(p1, p2) || samePoint(p1, p3) || samePoint(p2, p3))
            return true;

        int deltaX2 = p2.x - p1.x;
        int deltaY2 = p2.y - p1.y;

        int deltaX3 = p3.x - p1.x;
        int deltaY3 = p3.y - p1.y;

        return (deltaX2 * deltaY3 == deltaX3 * deltaY2);
    }

}


class Point {
    int x;
    int y;

    Point(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return String.format("Point(%4d,%4d)", x, y);
    }
}