package music_paraphernalia;

public class Mouthpiece extends Accessory {

    private String model;
    private String material;

    public Mouthpiece(ForInstrument forInstrument,
                      double boughtPrice,
                      double sellPrice,
                      String model,
                      String material) {
        super(forInstrument, boughtPrice, sellPrice);
        this.model = model;
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }
}
