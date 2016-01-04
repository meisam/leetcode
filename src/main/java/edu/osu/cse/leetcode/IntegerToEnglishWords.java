package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
 * <p>
 * For example,
 * <p>
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven" *
 *
 * @see <a href="https://leetcode.com/problems/integer-to-english-words/">Integer to English Words</a>
 */
public class IntegerToEnglishWords {

    public String numberToWords(int num) {
        String str = helper(num);
        if (str.trim().isEmpty())
            return "Zero";

        return str.replaceAll(" +", " ").trim();
    }

    public String helper(int num) {
        if (num == 0)
            return "";

        String[] literals = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        if (num < 20)
            return literals[num];

        String[] decimals = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


        if (num < 100) {
            int dec = num / 10;
            return " " + decimals[dec] + " " + literals[num % 10];
        }
        if (num < 1000) {
            int hundred = (num / 100);
            if (hundred == 0) {
                return helper(num % 100);
            }
            return literals[hundred] + " Hundred " + helper(num % 100);
        }


        int billions = num / 1000000000;
        int millions = (num % 1000000000) / 1000000;
        int thousands = (num % 1000000) / 1000;
        int hundreds = (num % 1000);

        String billionsStr = helper(billions) + " Billion ";
        String millionsStr = helper(millions) + " Million ";
        String thousandsStr = helper(thousands) + " Thousand ";
        String hundredsStr = helper(hundreds);

        return (billions == 0 ? "" : billionsStr) + (millions == 0 ? "" : millionsStr)
                + (thousands == 0 ? "" : thousandsStr) + hundredsStr;

    }

}
