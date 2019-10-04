package instruments;

public class Trombone extends Instrument {

    private String key;
    private String type;
    private String mouthpiece;


    public Trombone(String material,
                    String colour,
                    Family family,
                    double boughtPrice,
                    double sellPrice,
                    String key,
                    String type,
                    String mouthpiece) {
        super(material, colour, family, boughtPrice, sellPrice);
        this.key = key;
        this.type = type;
        this.mouthpiece = mouthpiece;
    }

    public String getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public String getMouthpiece() {
        return mouthpiece;
    }

    public String play() {
        if (getType().equals("valve")) {
            return getType() + " trombone playing: broo braa braaaah broo brooh.";
        }
        else {
            return getType() + " trombone playing: bwoo bwaa bwaa bwaaaaaaaaah.";
        }
    }
}
