public class Generic{
    public<T,U> void genericMethod(T value,U value2){
        System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        Generic g1=new Generic();
        g1.genericMethod(23,"Mayuri");
    }
}
