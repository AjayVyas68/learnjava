package MultiThreading;

public class oddNUmberRunnbale implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i+ "  "+Thread.currentThread().getName());
        }
    }
}
