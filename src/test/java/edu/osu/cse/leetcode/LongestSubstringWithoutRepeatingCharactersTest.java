package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void testLSWRC() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring("b"));
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));

        assertEquals(14, solution.lengthOfLongestSubstring("The following date and time conversion suffix characters are defined for the 't' and 'T' conversions. The types are similar to but not completely identical to those defined by GNU date and POSIX strftime(3c). Additional conversion types are provided to access Java-specific functionality (e.g. 'L' for milliseconds within the second)."));
        assertEquals(13, solution.lengthOfLongestSubstring("Forsaking monastic tradition, twelve jovial friars gave up their vocation for a questionable existence on the flying trapeze."));
        assertEquals(13, solution.lengthOfLongestSubstring("No kidding -- Lorenzo called off his trip to visit Mexico City just because they told him the conquistadores were extinct."));
        assertEquals(15, solution.lengthOfLongestSubstring("Jelly-like above the high wire, six quaking pachyderms kept the climax of the extravaganza in a dazzling state of flux."));
        assertEquals(11, solution.lengthOfLongestSubstring("Ebenezer unexpectedly bagged two tranquil aardvarks with his jiffy vacuum cleaner."));
        assertEquals(14, solution.lengthOfLongestSubstring("Six javelins thrown by the quick savages whizzed forty paces beyond the mark."));
        assertEquals(11, solution.lengthOfLongestSubstring("The explorer was frozen in his big kayak just after making queer discoveries."));
        assertEquals(10, solution.lengthOfLongestSubstring("The July sun caused a fragment of black pine wax to ooze on the velvet quilt."));
        assertEquals(10, solution.lengthOfLongestSubstring("The public was amazed to view the quickness and dexterity of the juggler."));
        assertEquals(13, solution.lengthOfLongestSubstring("While Suez sailors wax parquet decks, Afghan Jews vomit jauntily abaft."));
        assertEquals(10, solution.lengthOfLongestSubstring("We quickly seized the black axle and just saved it from going past him."));
        assertEquals(11, solution.lengthOfLongestSubstring("Six big juicy steaks sizzled in a pan as five workmen left the quarry."));
        assertEquals(11, solution.lengthOfLongestSubstring("While making deep excavations we found some quaint bronze jewelry."));
        assertEquals(11, solution.lengthOfLongestSubstring("Jaded zombies acted quaintly but kept driving their oxen forward."));
        assertEquals(13, solution.lengthOfLongestSubstring("A mad boxer shot a quick, gloved jab to the jaw of his dizzy opponent."));
        assertEquals(11, solution.lengthOfLongestSubstring("The job requires extra pluck and zeal from every young wage earner."));
        assertEquals(10, solution.lengthOfLongestSubstring("Whenever the black fox jumped the squirrel gazed suspiciously."));
        assertEquals(13, solution.lengthOfLongestSubstring("We promptly judged antique ivory buckles for the next prize."));
        assertEquals(17, solution.lengthOfLongestSubstring("How razorback-jumping frogs can level six piqued gymnasts!"));
        assertEquals(14, solution.lengthOfLongestSubstring("Crazy Fredericka bought many very exquisite opal jewels."));
        assertEquals(11, solution.lengthOfLongestSubstring("Sixty zippers were quickly picked from the woven jute bag."));
        assertEquals(13, solution.lengthOfLongestSubstring("Amazingly few discotheques provide jukeboxes."));
        assertEquals(13, solution.lengthOfLongestSubstring("Heavy boxes perform quick waltzes and jigs."));
        assertEquals(13, solution.lengthOfLongestSubstring("Jinxed wizards pluck ivy from the big quilt."));
        assertEquals(11, solution.lengthOfLongestSubstring("Big Fuji waves pitch enzymed kex liquor."));
        assertEquals(11, solution.lengthOfLongestSubstring("The quick brown fox jumps over a lazy dog."));

    }

}