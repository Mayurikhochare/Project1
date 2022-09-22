package MultiThreading;
class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println("My Thread is in Running State");

    }
}
public class MyThreadClass {
    public static void main(String[] args) {
        Thread myThread=new Thread(new MultiThreading());
        myThread.start();
    }

}
