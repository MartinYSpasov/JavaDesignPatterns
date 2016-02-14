package StricturalDesign.BridgePattern;

/**
 * Created by Martin on 2/7/2016.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setRunTime("2.14");
        movie.setTitle("John Wick");
        movie.setYear("2015");
        movie.setClassification("Action");

        Formatter formatter = new PrintFormatter();
        Printer printer = new MoviePrinter(movie);

        String printedMaterial = printer.print(formatter);
        System.out.println(printedMaterial);

    }
}
