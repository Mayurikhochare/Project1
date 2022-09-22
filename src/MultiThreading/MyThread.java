package MultiThreading;
class ExtendingThread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread is in Running State");
        System.out.println(getName());
        System.out.println(getState());
    }

}
public class MyThread {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            ExtendingThread ex = new ExtendingThread();
            ex.start();
        }
        System.out.println("There are "+Thread.activeCount()+" Active Threads");
    }
}
