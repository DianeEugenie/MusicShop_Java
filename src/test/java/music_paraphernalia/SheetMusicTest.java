package music_paraphernalia;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(ForInstrument.PIANO,
                10.00,
                15.99,
                "A Night At The Opera", "Queen");
    }

    @Test
    public void hasInstrumentForWhichItemIsFor(){
        //GIVEN we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN
        //THEN sheetMusic should be for piano
        assertEquals(ForInstrument.PIANO, sheetMusic.getForInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN
        //THEN sheetMusic should have bought price 10
        assertEquals(10.00, sheetMusic.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN
        //THEN sheetMusic should have sell price 15.99
        assertEquals(15.99, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void hasTitle(){
        //Given we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN
        //THEN sheetMusic should return A Night At The Opera
        assertEquals("A Night At The Opera", sheetMusic.getTitle());
    }

    @Test
    public void hasMaterial(){
        //Given we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN
        //THEN sheetMusic should return Queen
        assertEquals("Queen", sheetMusic.getArtist());
    }

    @Test
    public void canCalculateMarkup(){
        //GIVEN we have a sheetMusic
        assertNotNull(sheetMusic);
        //WHEN we calculate markup
        double markup = sheetMusic.calculateMarkup();
        //THEN should get 5.99 back
        assertEquals(5.99, markup, 0.01);
    }

}
