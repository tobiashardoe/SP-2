public class EBook extends NetTitle{
    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }
    private double calculatePages(){
        if(illustrated) {
            return (characters / 1800.0) * 1.1 + 20.0;
        } else {
            return (characters / 1800.0) + 20.0;
        }
    }

    @Override
    protected double calculatePoints() {
        return calculatePages()*convertLiteratureType()*getPseudoCopies();
    }
}
