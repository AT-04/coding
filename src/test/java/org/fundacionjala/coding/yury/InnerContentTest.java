package test.java.org.fundacionjala.coding.yury;

import main.java.org.fundacionjala.coding.yury.InnerContent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by YuryOrtuno on 5/25/2017.
 */
public class InnerContentTest {
    /**
     *
     */
    @Test
    public void innerOneWord() {
        InnerContent innerContent = new InnerContent();
        assertEquals("srot", innerContent.innerWord("sort"));
    }

    /**
     *
     */
    @Test
    public void innerTwoWord() {
        InnerContent innerContent = new InnerContent();
        assertEquals("inner ctonnet", innerContent.innerWord("inner content"));
    }

    /**
     *
     */
    @Test
    public void innerSentence() {
        InnerContent innerContent = new InnerContent();
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                innerContent.innerWord("sort the inner content in descending order"));
    }


}

