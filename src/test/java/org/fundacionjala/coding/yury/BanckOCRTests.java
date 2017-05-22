package org.fundacionjala.coding.yury;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCRTests {
    @Test
    public void instace(){
        BanckOCR bank=new BanckOCR();
        assertTrue(bank instanceof BanckOCR);
    }
}
