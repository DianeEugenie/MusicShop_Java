package music_paraphernalia;

public class Demper extends Accessory {

    private String shape;

    public Demper(ForInstrument forInstrument, double boughtPrice, double sellPrice, String shape) {
        super(forInstrument, boughtPrice, sellPrice);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
