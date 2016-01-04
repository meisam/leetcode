package edu.osu.cse.leetcode;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 * <p>
 * Follow up:
 * If this function is called many times, how would you optimize it?
 * <p>
 * Related problem: Reverse Integer
 * <p>
 * Credits:
 * Special thanks to @ts for adding this problem and creating all test cases.
 *
 * @see <a href="https://leetcode.com/problems/reverse-bits/">Reverse Bits</a>
 */
public class ReverseBits {
    public int reverseBits(int n) {

        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            int bitMask = 1 << i;
            int bitValue = (n & bitMask) >>> i;
            reverse |= bitValue << (31 - i);
        }

        return reverse;
    }
}
