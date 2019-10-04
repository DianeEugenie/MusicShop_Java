package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ViolinTest {

    Violin violin;
    Violin viola;
    Violin cello;

    @Before
    public void before(){
        violin = new Violin("spruce","Bubblegum pink",Family.STRING,100.00, 124.99, "violin", "electric", 4);
        viola = new Violin("maple","Gold",Family.STRING,90.00, 99.99, "viola", "acoustic", 4);
        cello = new Violin("maple","Yellow",Family.STRING,250.00, 299.99, "cello", "acoustic", 6);
    }

    @Test
    public void hasMaterial(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals("spruce", violin.getMaterial());
    }

    @Test
    public void hasColour(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals("Bubblegum pink", violin.getColour());
    }

    @Test
    public void hasFamily(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals(Family.STRING, violin.getFamily());
    }

    @Test
    public void hasBoughtPrice(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals(100.00, violin.getBoughtPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals(124.99, violin.getSellPrice(), 0.0);
    }

    @Test
    public void hasKey(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals("violin", violin.getKey());
    }

    @Test
    public void hasType(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals("electric", violin.getType());
    }

    @Test
    public void hasNumberOfStrings(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN
        //THEN
        assertEquals(4, violin.getNoOfStrings());
    }

    @Test
    public void canPlayTheViolin(){
        //GIVEN we have a violin
        assertNotNull(violin);
        //WHEN we play the violin
        String played = violin.play();
        //THEN
        assertEquals("electric violin playing: neew naw nooow naaaaw.", played);
    }

    @Test
    public void canPlayTheCello(){
        //GIVEN we have a cello
        assertNotNull(cello);
        //WHEN we play the cello
        String played = cello.play();
        //THEN
        assertEquals("acoustic cello playing: neew naw nooow naaaaw.", played);
    }

    @Test
    public void canCalculateMarkup(){
        //GIVEN we have a cello
        assertNotNull(cello);
        //WHEN we calculate markup
        double markup = cello.calculateMarkup();
        //THEN should get 49.99 back
        assertEquals(49.99, markup, 0.01);
    }





}
