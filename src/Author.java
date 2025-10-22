import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }
    public void addTitle(Title title){
        titles.add(title);
    }
    public double calculateRoyalties(){
        double total = 0;
        for(Title title: titles){
            total+=title.calculateRoyalty();
        }
        return total;
    }
    public String getName() {
        return name;
    }
}

