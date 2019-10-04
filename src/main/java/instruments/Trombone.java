package instruments;

import behaviours.ISell;
import music_paraphernalia.Mouthpiece;

public class Trombone extends Instrument implements ISell {

    private String key;
    private String type;
    private Mouthpiece mouthpiece;


    public Trombone(String material,
                    String colour,
                    Family family,
                    double boughtPrice,
                    double sellPrice,
                    String key,
                    String type,
                    Mouthpiece mouthpiece) {
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

    public Mouthpiece getMouthpiece() {
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

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}
