import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Color> list= new ArrayList<>();
        list.add(Color.BLUE);
        list.add(Color.BLUE);
        list.add(Color.BLUE);
        Mystery m1=new Mystery();
        System.out.println(m1.numberOfDistinctColors(list));
        System.out.println(m1.colorOccurence(list,Color.BLUE));
    }
}
