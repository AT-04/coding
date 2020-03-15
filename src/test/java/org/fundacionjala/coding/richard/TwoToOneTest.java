package org.fundacionjala.coding.richard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Richard on 8/27/2017.
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted
 * string, the longest possible, containing distinct letters,
 * each taken only once - coming from s1 or s2. #Examples: ```
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
 * a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
 */
public class TwoToOneTest {

    /**
     *
     */
    @Test
    public void test() {
        TwoToOne twoToOne = new TwoToOne();
        assertEquals("aehrsty", twoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu",
                twoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy",
                twoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
