public class AudioBook extends Title{
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes*0.5)*convertLiteratureType()*copies;
    }
}
