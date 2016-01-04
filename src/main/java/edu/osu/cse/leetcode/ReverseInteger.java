package edu.osu.cse.leetcode;

/**
 Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 *
 * @see <a href="https://leetcode.com/problems/reverse-integer/">Reverse Integer</a>
 * {@link }
 */
public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        long a = x;
        if (x < 0) {
            a = -a;
        }

        while (a > 0) {
            int lastDigit = (int) (a % 10);
            result = result * 10 + lastDigit;
            if ((x > 0) && (result >= (1L << 31))) {
                return 0;
            }

            if ((x < 0) && (result > (1L << 31))) {
                return 0;
            }

            a = a / 10;
        }

        return (int) (x < 0 ? -result : result);

    }
}