package music_paraphernalia;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MouthpieceTest {

    Mouthpiece mouthpiece;

    @Before
    public void before(){
        mouthpiece = new Mouthpiece(ForInstrument.TROMBONE, 5.00, 6.99, "4G Mega", "Silver");
    }

    @Test
    public void hasInstrumentForWhichItemIsFor(){
        //GIVEN we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN
        //THEN mouthpiece should be for trombone
        assertEquals(ForInstrument.TROMBONE, mouthpiece.getForInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN
        //THEN mouthpiece should have bought price 5
        assertEquals(5.00, mouthpiece.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN
        //THEN mouthpiece should have sell price 6.99
        assertEquals(6.99, mouthpiece.getSellPrice(), 0.0);
    }

    @Test
    public void hasModel(){
        //Given we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN
        //THEN mouthpiece should return the model 4G Mega
        assertEquals("4G Mega", mouthpiece.getModel());
    }

    @Test
    public void hasMaterial(){
        //Given we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN
        //THEN mouthpiece should return material Silver
        assertEquals("Silver", mouthpiece.getMaterial());
    }

    @Test
    public void canCalculateMarkup(){
        //GIVEN we have a mouthpiece
        assertNotNull(mouthpiece);
        //WHEN we calculate markup
        double markup = mouthpiece.calculateMarkup();
        //THEN should get 1.99 back
        assertEquals(1.99, markup, 0.01);
    }
    


}
