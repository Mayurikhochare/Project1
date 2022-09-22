import java.util.Random;

class Ghost{
    String[] colors={"Yellow","red","white","Blue"};
    public String getColor(){
        Random random=new Random();
        int index=random.nextInt(colors.length);
        return colors[index];
    }
}


public class GhostColor {
    public static void main(String[] args) {
       Ghost ghost=new Ghost();
        System.out.println(ghost.getColor());
    }
}
