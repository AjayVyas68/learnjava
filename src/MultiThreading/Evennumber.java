package MultiThreading;

public class Evennumber extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i +Thread.currentThread().getName());
                Thread.sleep(1000 );

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
