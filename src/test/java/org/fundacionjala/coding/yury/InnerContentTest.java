package org.fundacionjala.coding.yury;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YuryOrtuno on 5/25/2017.
 */
public class InnerContentTest {
    private InnerContent innerContent;

    /**
     */
    @Before
    public void before() {
        innerContent = new InnerContent();
    }

    /**
     *
     */
    @Test
    public void innerOneWord() {

        assertEquals("srot", innerContent.innerWord("sort"));
    }

    /**
     *
     */
    @Test
    public void innerTwoWord() {
        assertEquals("inner ctonnet", innerContent.innerWord("inner content"));
    }

    /**
     *
     */
    @Test
    public void innerSentence() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                innerContent.innerWord("sort the inner content in descending order"));
    }


}

