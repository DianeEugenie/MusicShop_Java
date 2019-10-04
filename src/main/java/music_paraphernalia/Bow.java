package music_paraphernalia;

public class Bow extends Accessory {

    private String hairType;

    public Bow(ForInstrument forInstrument, double boughtPrice, double sellPrice, String hairType) {
        super(forInstrument, boughtPrice, sellPrice);
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }
}
