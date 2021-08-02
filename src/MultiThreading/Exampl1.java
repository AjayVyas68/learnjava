package MultiThreading;

public class Exampl1 {
    //Starting point
    public static void main(String[] args) {
        Evennumber e = new Evennumber();
        e.start();
        System.out.println("end"+Thread.currentThread().getName());
    }
}
