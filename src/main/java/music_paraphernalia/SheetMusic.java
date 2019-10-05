package music_paraphernalia;

public class SheetMusic extends Accessory {

    private String title;
    private String artist;

    public SheetMusic(ForInstrument forInstrument,
                      double boughtPrice,
                      double sellPrice,
                      String title,
                      String artist) {
        super(forInstrument, boughtPrice, sellPrice);
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
