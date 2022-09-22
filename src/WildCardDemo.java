import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);
        List<String> list1=new ArrayList<>();
        list1.add("Mayuri");
        list1.add("khochare");
        printList(list1);

    }
    public static void printList(List<?> listOfAll){
        System.out.println(listOfAll);

    }
}
