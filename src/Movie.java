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
        Movie[] movies = new Movie[mov.length];
        int Index = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                movies[Index] = mov[i];
                Index++;
            }
        }
        return movies;
    }


    public static void main(String[] args) {
        Movie[] mov = new Movie[3];
        Movie m = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie m1 = new Movie("Dear Zindagi", "Dharma Productions", "PG");
        Movie m2 = new Movie("Brahmastra", "Star Productions");

        mov[0] = m;
        mov[1] = m1;
        mov[2] = m2;

        Movie[] arr=getPg(mov);
        for(Movie str:arr){
            System.out.println(str);

        }




    }
}

