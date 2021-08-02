package DecisionStatement;

public class Example4 {
    public static void main(String[] args) {
        int x = 10, y = 22, z = 33;
        if (x > y) {
            if (y > z) {
                System.out.println("its true");
            }
        } else
            System.out.println("it's false");
    }
}
