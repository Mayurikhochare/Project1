import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args) throws SQLException {
        System.out.println("Program started");
        String s1="Hello";
        try{
            int a=Integer.parseInt(s1);
            System.out.println(a*a);
        }
        catch(NumberFormatException n){
            System.out.println(n);
        }
        try{
            test();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }

        System.out.println("Program Ended");
    }
    static void test()throws SQLException{
        throw new SQLException();
    }
}
