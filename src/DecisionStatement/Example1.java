package DecisionStatement;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int result = x < y ? 50 : 100;
        System.out.println(result);
    }
}
