package instruments;

public class Violin extends Instrument {

    private String key;
    private String type;
    private int noOfStrings;

    public Violin(String material,
                  String colour,
                  Family family,
                  double boughtPrice,
                  double sellPrice,
                  String key,
                  String type,
                  int noOfStrings
                  ) {
        super(material, colour, family, boughtPrice, sellPrice);
        this.key = key;
        this.type = type;
        this.noOfStrings = noOfStrings;
    }

    public String getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play(String string) {
        return "Playing the melodic " + string + " on the " + getType() + " " + getKey() + ".";
    }
}
