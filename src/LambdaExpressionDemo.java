interface addition{
    void test(int num1,int num2);
}
public class LambdaExpressionDemo{
    public static void main(String[] args) {
        addition add=(number1,number2)->
                System.out.println("Addition is " + (number1 + number2));
        add.test(10, 20);
    }
}

