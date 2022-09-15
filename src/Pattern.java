public class Pattern {
    public static void main(String[] args) {
        int rows=5;
        int columns=1;

        for(int row=1;row<=rows;row++){
            char ch='A';
            for(int col=1;col<=columns;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            columns++;
        }
    }
}
