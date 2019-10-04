package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TromboneTest {

    Trombone trombone1;
    Trombone trombone2;

    @Before
    public void before(){
        trombone1 = new Trombone("brass", "Kiwi green", Family.BRASS, 150.00, 169.99, "tenor", "slide", "titanium");
        trombone2 = new Trombone("brass", "green", Family.BRASS, 60.00, 64.99, "tenor", "valve", "silver");
    }

    @Test
    public void hasMaterial(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals("brass", trombone1.getMaterial());
    }

    @Test
    public void hasColour(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals("Kiwi green", trombone1.getColour());
    }

    @Test
    public void hasFamily(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals(Family.BRASS, trombone1.getFamily());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals(150.00, trombone1.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals(169.99, trombone1.getSellPrice(), 0.0);
    }

    @Test
    public void hasKey(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals("tenor", trombone1.getKey());
    }

    @Test
    public void hasType(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals("slide", trombone1.getType());
    }

    @Test
    public void hasTitaniumMouthpiece(){
        //GIVEN we have a trombone
        assertNotNull(trombone1);
        //WHEN
        //THEN
        assertEquals("titanium", trombone1.getMouthpiece());
    }

    @Test
    public void canPlayTheSlideTrombone(){
        //GIVEN we have a slide trombone
        assertNotNull(trombone1);
        //WHEN we play the slide trombone
        String played = trombone1.play();
        //THEN
        assertEquals("slide trombone playing: bwoo bwaa bwaa bwaaaaaaaaah.", played);
    }

    @Test
    public void canPlayTheValveTrombone(){
        //GIVEN we have a valve trombone
        assertNotNull(trombone2);
        //WHEN we play the valve trombone
        String played = trombone2.play();
        //THEN
        assertEquals("valve trombone playing: broo braa braaaah broo brooh.", played);
    }


}
