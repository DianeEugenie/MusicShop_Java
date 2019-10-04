package instruments;

public class Saxophone extends Instrument {

    private String key;
    private double reedSize;

    public Saxophone(String material,
                     String colour,
                     Family family,
                     double boughtPrice,
                     double sellPrice,
                     String key,
                     double reedSize) {
        super(material, colour, family, boughtPrice, sellPrice);
        this.key = key;
        this.reedSize = reedSize;
    }

    public String getKey() {
        return key;
    }

    public double getReedSize() {
        return reedSize;
    }

    public String play() {
        return getKey() + " sax playing: truhh duh tuh duh truuhhh";
    }
}
