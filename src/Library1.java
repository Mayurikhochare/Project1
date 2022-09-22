public class Library1<T> {
    String title;
    String author;
    double cost;

    T type;

    public Library1(T type,String title, String author, double cost) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type=type;
    }
    public void displayInfo(String video){
        if(type.equals("String")){
            System.out.println("Book Title: "+ title+"\n"+"Author: "+author+"\n"+"Cost: "+cost);
            System.out.println("_________________________________________________________________________");
        }
        if(type.equals('M')){
            System.out.println("Video Title: "+ title+"\n"+"Uploaded By: "+author+"\n"+"Cost: "+cost);
            System.out.println("_________________________________________________________________________");
        }
        if(type.equals(1)){
            System.out.println("Newspaper Title: "+ title+"\n"+"Publish By: "+author+"\n"+"Cost: "+cost);
            System.out.println("__________________________________________________________________________");
        }
    }

    public static void main(String[] args) {
        Library1<String> library=new Library1("String","Robinson Curuso","daniel defoe",3000.9);
        library.displayInfo("Video");
        Library1<Character> library1=new Library1('M',"Elvis Pressley in the Army","daniel defoe",4500.50);
        library1.displayInfo("Video");
        Library1<Integer> library2=new Library1(1,"News & Disturber","Charlie",500.34);
        library2.displayInfo("Video");


    }
}