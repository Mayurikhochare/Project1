import java.util.ArrayList;
public class Library1<T> {

    private ArrayList<T> mediaCollection = new ArrayList<T>();

    public Library1() {
        Book b = new Book();
        storeMedia((T) b);
        Video v = new Video();
        storeMedia((T) v);
        Newspaper n = new Newspaper();
        storeMedia((T) n);
        showMedia();
    }

    public void showMedia() {
        System.out.println("These items are in the media collection:");
        for (Object resource : mediaCollection.toArray()) {
            System.out.print("\t" + resource.toString() + "\n");
        }
    }

    public void storeMedia(T item) {
        mediaCollection.add(item);
    }

    public class Book implements Media {

        String type = "book";
        String name = "Robinson Curuso";

        public Book(){
            System.out.println(this.getClass());
        }

        public String toString() {
            return "type is " + type + ", name is: " + name;
        }
    }

    class Video implements Media {

        String type = "video";
        String name = "Elvis Pressley in the Army";

        public String toString() {
            return "type is " + type + ", name is: " + name;
        }
    }

    class Newspaper {

        String type = "newspaper";
        String name = "News & Disturber";

        public String toString() {
            return "type is " + type + ", name is: " + name;
        }
    }

    interface Media {
//        String type;
    }

    public static void main(String[] args) {
        Library1<Media> lib = new Library1<Media>();
    }

}