public class AudioBook extends PhysicalTitle implements IAudioBook{
    private int durationInMinutes;


    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }
    @Override
    public int getDurationInMinutes(){
        return durationInMinutes/2;
    }
    @Override
    protected double calculatePoints() {
        return getDurationInMinutes()*convertLiteratureType()*copies;
    }
}
