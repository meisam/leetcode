package edu.osu.cse.leetcode;

/**
 * Write a program to check whether a given number is an ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * <p>
 * Note that 1 is typically treated as an ugly number.
 * <p>
 * @see <a href="https://leetcode.com/problems/ugly-number">Ugly Number</a>
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        if (num < 1)
            return false;

        int current = num;
        if (num < 0) current = -current;

        while (current % 2 == 0) {
            current = current >>> 1;
        }

        while (current % 3 == 0) {
            current = current / 3;
        }

        while (current % 5 == 0) {
            current = current / 5;
        }

        return current == 1;
    }
}
