package music_paraphernalia;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private ForInstrument forInstrument;
    private double boughtPrice;
    private double sellPrice;

    public Accessory(ForInstrument forInstrument,
                     double boughtPrice,
                     double sellPrice){
        this.forInstrument = forInstrument;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public ForInstrument getForInstrument() {
        return forInstrument;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

}
