package instruments;

public class Trombone extends Instrument {

    private String key;
    private String type;
    private String mouthPiece;


    public Trombone(String material,
                    String colour,
                    Family family,
                    double boughtPrice,
                    double sellPrice,
                    String key,
                    String type,
                    String mouthPiece) {
        super(material, colour, family, boughtPrice, sellPrice);
        this.key = key;
        this.type = type;
        this.mouthPiece = mouthPiece;
    }

    public String getKey() {
        return key;
    }

    public String getType() {
        return type;
    }

    public String getMouthPiece() {
        return mouthPiece;
    }

    public String play(String string) {
        return "Filling the room with the dreamy tunes of " + string + " by playing the " + getKey() + " " + getType() + " trombone using a " + getMouthPiece() + " mouthpiece.";
    }
}
