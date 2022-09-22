package MultiThreading.Synchronization;

public class SeriesPrinter {
    public void printSeries(int num) throws InterruptedException {
        for(int i=0;i<num;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
class ThreadDemo extends Thread{
    final int number;
    SeriesPrinter sp;

    ThreadDemo(int num,SeriesPrinter series) {
        number = num;
        sp=series;
    }

    @Override
    public void run() {
        synchronized (sp){
            try {
                sp.printSeries(number);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SyncThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        SeriesPrinter seriesPrinter=new SeriesPrinter();
        ThreadDemo thread1=new ThreadDemo(10,seriesPrinter);
        ThreadDemo thread2=new ThreadDemo(5,seriesPrinter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}