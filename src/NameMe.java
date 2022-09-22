public class NameMe {
    String name="";
    String firstName="";
    String lastName="";
    public NameMe(String first,String last) {
        this.firstName=first;
        this.lastName=last;
        this.name=first+last;

    }

    public static void main(String[] args) {
        NameMe me= new NameMe("mayuri","Khochare");
        System.out.println(me.firstName);
        System.out.println(me.lastName);
        System.out.println(me.name);
    }
}
