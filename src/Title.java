public abstract class Title {
    private String title;
    private String literatureType;
    private static double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints()*RATE;
    }

    protected abstract double calculatePoints();



    protected double convertLiteratureType() {
        if (literatureType.equals("BI")) {
            return 3.0;
        } else if (literatureType.equals("TE")){
            return 3.0;
        } else if (literatureType.equals("LYRIK")){
            return 6.0;
        } else if (literatureType.equals("SKØN")){
            return 1.7;
        } else if (literatureType.equals("FAG")){
            return 1.0;
        }
        return 0;
    }
}
