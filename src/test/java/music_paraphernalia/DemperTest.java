package music_paraphernalia;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DemperTest {

    Demper demper;

    @Before
    public void before(){
        demper = new Demper(ForInstrument.TROMBONE,20.00, 25.99, "Extending Tube");
    }

    @Test
    public void hasInstrumentForWhichItemIsFor(){
        //GIVEN we have a demper
        assertNotNull(demper);
        //WHEN
        //THEN demper should be for trombone
        assertEquals(ForInstrument.TROMBONE, demper.getForInstrument());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a demper
        assertNotNull(demper);
        //WHEN
        //THEN demper should have bought price 20
        assertEquals(20.00, demper.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a demper
        assertNotNull(demper);
        //WHEN
        //THEN demper should have sell price 25.99
        assertEquals(25.99, demper.getSellPrice(), 0.0);
    }

    @Test
    public void hasShape(){
        //Given we have a demper
        assertNotNull(demper);
        //WHEN
        //THEN demper should return shape extending tube
        assertEquals("Extending Tube", demper.getShape());
    }
}
