package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PianoTest {

    Piano grandPiano;
    Piano uprightPiano;

    @Before
    public void before(){
        grandPiano = new Piano("maple",
                "Black and Yellow",
                Family.PERCUSSION,
                2000.00,
                2399.99,
                "grand piano");
        uprightPiano = new Piano("spruce",
                "Disco party",
                Family.PERCUSSION,
                1000.00,
                1199.99,
                "Upright piano");
    }

    @Test
    public void hasMaterial(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals("maple", grandPiano.getMaterial());
    }

    @Test
    public void hasColour(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals("Black and Yellow", grandPiano.getColour());
    }

    @Test
    public void hasFamily(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals(Family.PERCUSSION, grandPiano.getFamily());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals(2000.00, grandPiano.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals(2399.99, grandPiano.getSellPrice(), 0.0);
    }

    @Test
    public void hasSize(){
        //GIVEN we have a piano
        assertNotNull(grandPiano);
        //WHEN
        //THEN
        assertEquals("grand piano", grandPiano.getSize());
    }

    @Test
    public void canPlayGrandPiano(){
        //GIVEN we have a grand piano
        assertNotNull(grandPiano);
        //WHEN we play the grand piano
        String played = grandPiano.play();
        //THEN
        assertEquals("grand piano playing: plink plonk plenk ploonk.", played);
    }

    @Test
    public void canPlayUprightPiano(){
        //GIVEN we have a upright piano
        assertNotNull(uprightPiano);
        //WHEN we play the upright piano
        String played = uprightPiano.play();
        //THEN
        assertEquals("upright piano playing: plink plonk plenk ploonk.", played);
    }




}
