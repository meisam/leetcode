package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fathi on 9/8/15.
 */
public class IntegerToEnglishWordsTest {
    IntegerToEnglishWords solution = new IntegerToEnglishWords();

    @Test
    public void testNumberToWords() throws Exception {

        assertEquals("Twelve Thousand Three Hundred Forty Five", solution.numberToWords(12345));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                solution.numberToWords(1234567));
        assertEquals("Zero", solution.numberToWords(0));
        assertEquals("One", solution.numberToWords(1));
        assertEquals("Ten", solution.numberToWords(10));
        assertEquals("Twelve", solution.numberToWords(12));
        assertEquals("One Hundred", solution.numberToWords(100));
        assertEquals("One Hundred Three", solution.numberToWords(103));
        assertEquals("One Hundred Thirty", solution.numberToWords(130));
        assertEquals("Two Million", solution.numberToWords(2000000));
        assertEquals("Two Million One Thousand", solution.numberToWords(2001000));
    }
}