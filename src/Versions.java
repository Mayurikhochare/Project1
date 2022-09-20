import java.util.Scanner;

public class Versions {
    String initial_version="0.0.1";
    int major;
    int minor;
    int patch;

    public Versions(int major,int minor,int patch) {
        this.major=major;
        this.minor=minor;
        this.patch=patch;
    }
//    public void vm(){
//        if (this.major.isEmpty() && this.minor=null && this.patch=null ) {
//
//        }
//        public String major(String version){
//
//        }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int major=sc.nextInt();
        int minor=sc.nextInt();
        int patch=sc.nextInt();
        Versions versions=new Versions(major,minor,patch);
    }
}
