package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private Family family;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(String material, String colour, Family family, double boughtPrice, double sellPrice){
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Family getFamily() {
        return family;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public abstract String play();

}
