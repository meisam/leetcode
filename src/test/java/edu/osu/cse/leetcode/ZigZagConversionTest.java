package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class ZigZagConversionTest {

    ZigZagConversion solution = new ZigZagConversion();

    @Test
    public void testConvert() throws Exception {
        assertEquals("",
                solution.convert("", 1));
        assertEquals("",
                solution.convert("", 2));
        assertEquals("",
                solution.convert("", 10));
        assertEquals("12345",
                solution.convert("12345", 1));
        assertEquals("PAHNAPLSIIGYIR",
                solution.convert("PAYPALISHIRING", 3));
        assertEquals("ACEGIKMOQSUWYBDFHJLNPRTVX",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXY", 2));
        assertEquals("ACEGIKMOQSUWYBDFHJLNPRTVXZ",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 2));
        assertEquals("AEIMQUYBDFHJLNPRTVXZCGKOSW",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3));
        assertEquals("AGMSYBFHLNRTXZCEIKOQUWDJPV",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 4));
        assertEquals("AIQYBHJPRXZCGKOSWDFLNTVEMU",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5));
        assertEquals("AKUBJLTVCIMSWDHNRXEGOQYFPZ",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 6));
        assertEquals("AMYBLNXZCKOWDJPVEIQUFHRTGS",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 7));
        assertEquals("AOBNPCMQDLRZEKSYFJTXGIUWHV",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 8));
        assertEquals("AQBPRCOSDNTEMUFLVGKWHJXZIY",
                solution.convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 9));
    }
}