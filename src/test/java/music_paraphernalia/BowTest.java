package music_paraphernalia;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BowTest {

    Bow bow;

    @Before
    public void before(){
        bow = new Bow(ForInstrument.VIOLIN,10.00, 14.99, "horse hair");
    }

    @Test
    public void hasInstrumentForWhichItemIsFor(){
        //GIVEN we have a bow
        assertNotNull(bow);
        //WHEN
        //THEN bow should be for violin
        assertEquals(ForInstrument.VIOLIN, bow.getForInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a bow
        assertNotNull(bow);
        //WHEN
        //THEN bow should have bought price 10
        assertEquals(10.00, bow.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a bow
        assertNotNull(bow);
        //WHEN
        //THEN bow should have sell price 14.99
        assertEquals(14.99, bow.getSellPrice(), 0.0);
    }

    @Test
    public void hasHairType(){
        //Given we have a bow
        assertNotNull(bow);
        //WHEN
        //THEN bow should have horse hair
        assertEquals("horse hair", bow.getHairType());
    }

    @Test
    public void canCalculateMarkup(){
        //GIVEN we have a bow
        assertNotNull(bow);
        //WHEN we calculate markup
        double markup = bow.calculateMarkup();
        //THEN should get 4.99 back
        assertEquals(4.99, markup, 0.01);
    }
}
