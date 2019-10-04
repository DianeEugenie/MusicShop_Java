package shop;

import instruments.Family;
import instruments.Piano;
import instruments.Saxophone;
import music_paraphernalia.ForInstrument;
import music_paraphernalia.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    Saxophone altSaxophone;
    SheetMusic sheetMusic;
    Piano uprightPiano;

    @Before
    public void before(){
        shop = new Shop("DJ's");
        altSaxophone = new Saxophone("brass",
                "Baby blue",
                Family.WOODWIND,
                95.00,
                129.99,
                "alto",
                2);
        sheetMusic = new SheetMusic(ForInstrument.PIANO,
                10.00,
                15.99,
                "A Night At The Opera", "Queen");
        uprightPiano = new Piano("spruce",
                "Disco party",
                Family.PERCUSSION,
                1000.00,
                1199.99,
                "upright piano");
    }

    @Test
    public void hasName(){
        //GIVEN we have a shop
        assertNotNull(shop);
        //WHEN
        //THEN we should get DJ's
        assertEquals("DJ's", shop.getName());
    }

    @Test
    public void startsEmpty(){
        //GIVEN we have a shop
        assertNotNull(shop);
        //WHEN
        //THEN we should have no stock
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddISellItemToStock(){
        //GIVEN we have a shop
        assertNotNull(shop);
        //AND a saxophone
        assertNotNull(altSaxophone);
        //WHEN we add item to stock
        shop.addItem(altSaxophone);
        //THEN we should have stock size 1
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveISellItemFromStock(){
        //GIVEN we have a shop
        assertNotNull(shop);
        //AND a saxophone
        assertNotNull(altSaxophone);
        //AND the sax has been added to the stock
        shop.addItem(altSaxophone);
        assertEquals(1, shop.getStockSize());
        //WHEN we remove the item from the stock
        shop.removeItem(altSaxophone);
        //ThEN stock size should be 0
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        //GIVEN we have a shop
        assertNotNull(shop);
        //AND we have several items in the shop
        assertNotNull(altSaxophone);
        assertNotNull(sheetMusic);
        assertNotNull(uprightPiano);
        shop.addItem(altSaxophone);
        shop.addItem(sheetMusic);
        shop.addItem(uprightPiano);
        //WHEN we calculate total potential profit
        double totalProfit = shop.calculatePotentialProfit();
        //THEN we should get 34.99 + 5.99 + 199.99 back
        assertEquals(240.97, totalProfit, 0.01);

    }
}
