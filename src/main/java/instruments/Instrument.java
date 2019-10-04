package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private FamilyType familyType;

    public Instrument(String material, String colour, FamilyType familyType){
        this.material = material;
        this.colour = colour;
        this.familyType = familyType;
    }

    public abstract String play(String string);

}
