package instruments;

import behaviours.ISell;

public class Piano extends Instrument implements ISell {

    private String size;

    public Piano(String material,
                 String colour,
                 Family family,
                 double boughtPrice,
                 double sellPrice,
                 String size) {
        super(material, colour, family, boughtPrice, sellPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play() {
        return getSize() + " playing: plink plonk plenk ploonk.";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
