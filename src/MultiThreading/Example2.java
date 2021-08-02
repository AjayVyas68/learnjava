package MultiThreading;

public class Example2 {
    public static void main(String[] args) {
        var t = new oddNUmberRunnbale();
        var t1 = new Thread(t, "t");
        var t2 = new Thread(t, "t1");
        t2.start();
        t1.start();


        System.out.println("END MAIN" +Thread.currentThread().getName());
    }

}
