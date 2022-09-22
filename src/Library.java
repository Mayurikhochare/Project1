//non-generic
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    String title;
    String author;
    double cost;

    public Library(String title, String author, double cost) {
        this.title = title;
        this.author = author;
        this.cost = cost;
    }
    public void displayInfo(String type){
        if(type.equals("Book")){
            System.out.println("Book Title: "+ title+"\n"+"Author: "+author+"\n"+"Cost: "+cost);
            System.out.println("_________________________________________________________________________");
        }
        if(type.equals("Video")){
            System.out.println("Video Title: "+ title+"\n"+"Uploaded By: "+author+"\n"+"Cost: "+cost);
            System.out.println("_________________________________________________________________________");
        }
        if(type.equals("Newspaper")){
            System.out.println("Newspaper Title: "+ title+"\n"+"Publish By: "+author+"\n"+"Cost: "+cost);
            System.out.println("__________________________________________________________________________");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        Library library=new Library("Robinson Curuso","daniel defoe",3000.9);
        library.displayInfo(type);
        Library library1=new Library("Elvis Pressley in the Army","daniel defoe",4500.50);
        library1.displayInfo(type);
        Library library2=new Library("News & Disturber","Charlie",500.34);
        library2.displayInfo(type);

    }
}