import java.util.ArrayList;
import java.util.List;

public class UpperBoundGeneric {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);
        List<Double> list1=new ArrayList<>();
        list1.add(22.3);
        list1.add(33.9);
        printList(list1);
        List<Number> list2=new ArrayList<>();
        list2.add(23);
        list2.add(2.9);
        list2.add(23.8f);
        printList(list2);

    }
    public static void printList(List<? extends Number> listOfAll){
        System.out.println(listOfAll);

    }
}

