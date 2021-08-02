package loopingAndOpertator;

public class Example7 {
    public static void main(String[] args) {
        int i = 1, j= 1;
        A:
        while (i <= 3)// A: label of this while loop
        {
            B:
            while (j <= 3) {
                System.out.println(":)");
                if (j % 2 == 0) break B;
                j++;
            }
            i++;
        }
    }
}
