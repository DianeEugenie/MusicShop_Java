package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SaxophoneTest {

    Saxophone altSaxophone;
    Saxophone baritoneSaxophone;

    @Before
    public void before(){
        altSaxophone = new Saxophone("brass",
                "Baby blue",
                Family.WOODWIND,
                95.00,
                129.99,
                "alto",
                2);
        baritoneSaxophone = new Saxophone("brass",
                "Pitch black",
                Family.WOODWIND,
                125.00,
                139.99,
                "baritone",
                4.5);
    }

    @Test
    public void hasMaterial(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals("brass", altSaxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals("Baby blue", altSaxophone.getColour());
    }

    @Test
    public void hasFamily(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals(Family.WOODWIND, altSaxophone.getFamily());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals(95.00, altSaxophone.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals(129.99, altSaxophone.getSellPrice(), 0.0);
    }

    @Test
    public void hasKey(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals("alto", altSaxophone.getKey());
    }

    @Test
    public void hasSize2Reed(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN
        //THEN
        assertEquals(2.0, altSaxophone.getReedSize(), 0.0);
    }

    @Test
    public void canPlayTheAltSax(){
        //GIVEN we have a alto saxophone
        assertNotNull(altSaxophone);
        //WHEN we play the alto saxophone
        String played = altSaxophone.play();
        //THEN
        assertEquals("alto sax playing: truhh duh tuh duh truuhhh", played);
    }

    @Test
    public void canPlayTheBaritoneSax(){
        //GIVEN we have a baritone saxophone
        assertNotNull(baritoneSaxophone);
        //WHEN we play the baritone saxophone
        String played = baritoneSaxophone.play();
        //THEN
        assertEquals("baritone sax playing: truhh duh tuh duh truuhhh", played);
    }

    @Test
    public void canCalculateMarkup(){
        //GIVEN we have a saxophone
        assertNotNull(altSaxophone);
        //WHEN we calculate markup
        double markup = altSaxophone.calculateMarkup();
        //THEN should get 34.99 back
        assertEquals(34.99, markup, 0.01);
    }
}
