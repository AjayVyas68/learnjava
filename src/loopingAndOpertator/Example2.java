package loopingAndOpertator;

public class Example2 {
    public static void main(String[] args) {
        Cat c = new Cat("tom", 12);
        Cat c1 = new Cat("mot", 15);
        boolean b = c == c1;
        boolean b1 = c != c1;
        System.out.println(b1);
        System.out.println(b);
    }
}

class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }
}