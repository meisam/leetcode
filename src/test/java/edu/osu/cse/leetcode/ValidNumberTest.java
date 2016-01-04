package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 10/20/15.
 */
public class ValidNumberTest {

    ValidNumber solution = new ValidNumber();

    @Test
    public void testIsNumber() {
        assertTrue(solution.isNumber("0"));
        assertTrue(solution.isNumber("1"));
        assertTrue(solution.isNumber("12345678"));
        assertTrue(solution.isNumber("+1"));
        assertTrue(solution.isNumber("-1"));
        assertTrue(solution.isNumber("-123"));
        assertTrue(solution.isNumber("+123"));
        assertTrue(solution.isNumber("12."));
        assertTrue(solution.isNumber("12.555"));
        assertTrue(solution.isNumber(".555"));
        assertTrue(solution.isNumber("-.555"));
        assertTrue(solution.isNumber("-12."));
        assertTrue(solution.isNumber("-12.555"));
        assertTrue(solution.isNumber("+12.555"));
        assertTrue(solution.isNumber("+1e1"));
        assertTrue(solution.isNumber("+1e12"));
        assertTrue(solution.isNumber("+1e-12"));
        assertTrue(solution.isNumber("+10e+12"));
        assertTrue(solution.isNumber("-10e+12"));
        assertTrue(solution.isNumber("-10.e+12"));
        assertTrue(solution.isNumber("-1.0e+12"));
        assertTrue(solution.isNumber("-.10e+12"));
        assertTrue(solution.isNumber("-.1e+12"));
        assertTrue(solution.isNumber("-1.e+12"));
        assertTrue(solution.isNumber("-1.e+12"));
        assertTrue(solution.isNumber("-1.E+12"));
        assertTrue(solution.isNumber("1e1"));
        assertTrue(solution.isNumber(" 1e1 "));

        assertFalse(solution.isNumber(""));
        assertFalse(solution.isNumber("e"));
        assertFalse(solution.isNumber("e1"));
        assertFalse(solution.isNumber("-1.e"));
        assertFalse(solution.isNumber("-1.ee"));
        assertFalse(solution.isNumber("-1.e1e"));
        assertFalse(solution.isNumber("-1.e+"));
        assertFalse(solution.isNumber("1 e 1"));
        assertFalse(solution.isNumber("-1.e-"));
        assertFalse(solution.isNumber("-.e+12"));
        assertFalse(solution.isNumber("."));
        assertFalse(solution.isNumber(".."));
        assertFalse(solution.isNumber("a"));
        assertFalse(solution.isNumber("a"));
        assertFalse(solution.isNumber(".555."));
        assertFalse(solution.isNumber(""));
        assertFalse(solution.isNumber("."));
        assertFalse(solution.isNumber("0xff"));
        assertFalse(solution.isNumber("1.1.2"));

    }

}