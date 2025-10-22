public class LibaryRoyaltyCalculator {
    public static void main(String[] args) {
        Author a1 = new Author("Olga Ravn");
        AudioBook ab1 = new AudioBook("Celestine", "SKØN", 140, 192);
        PrintedBook pb1 = new PrintedBook("bog 2", "FAG", 160, 245);
        PrintedBook pb2 = new PrintedBook("bog 3", "BI", 250, 60);
        a1.addTitle(ab1);
        a1.addTitle(pb1);
        a1.addTitle(pb2);
        System.out.printf("%s: %.2f kr.%n", a1.getName(), a1.calculateRoyalties());

    }
}
