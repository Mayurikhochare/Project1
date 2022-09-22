import java.util.ArrayList;
import java.util.Iterator;

public class Movie {
    private String titleOfMovie;
    private String studioName;
    private String rating;

    public Movie(String titleOfMovie, String studioName, String rating) {
        this.titleOfMovie = titleOfMovie;
        this.studioName = studioName;
        this.rating = rating;
    }

    public Movie(String titleOfMovie, String studioName) {
        this.titleOfMovie = titleOfMovie;
        this.studioName = studioName;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] mov) {
        Movie[] movie = new Movie[mov.length];
        int index = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                movie[index] = mov[i];
                index++;
            }
        }
        return movie;

    }

    public static void main(String[] args) {

        Movie m = new Movie("Casino Royale", "Eon Productions", "PG");
        Movie m1 = new Movie("Dear Zindagi", "Dharma Productions", "PG");
        Movie m2 = new Movie("Brahmastra", "Star Productions");
        Movie[] mov1 = new Movie[3];
        mov1[0] = m;
        mov1[1] = m1;
        mov1[2] = m2;

        Movie[] arr = getPg(mov1);
        for (int i=0;i<=1;i++) {
            if(arr[i]!=null) {
                System.out.println(arr[i].titleOfMovie);
            }
        }

    }
}


