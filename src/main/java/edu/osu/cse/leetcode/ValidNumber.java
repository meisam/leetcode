package edu.osu.cse.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate if a given string is numeric.
 * <p>
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 *
 * @see <a href="https://leetcode.com/problems/valid-number">Valid Number</a>
 */
public class ValidNumber {
    final static Pattern numberPattern = Pattern.compile("^\\s*([+\\-]?(\\d+\\.\\d*|\\d*\\.\\d+|\\d+)((e|E)[+\\-]?\\d+)?)\\s*$");

    public boolean isNumber(String s) {

        Matcher matcher = numberPattern.matcher(s);
        return matcher.find();
    }
}


