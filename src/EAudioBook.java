public class EAudioBook extends NetTitle implements IAudioBook{
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public int getDurationInMinutes(){
        return durationInMinutes/2;
    }
    @Override
    protected double calculatePoints() {
        return getDurationInMinutes()*convertLiteratureType()*getPseudoCopies();
    }
}
