package loopingAndOpertator;

public class Example6 {
    public static void main(String[] args) {
      ExampleContiune erw=new
              ExampleContiune();
      erw.Cont();
        /*
         *   break And Continue keyword
         *  break keyword we use  break the flow
         *  continue keyword is use to flow contiune;
         * */
        System.out.println("While loop using break keyword" );
        int i = 1;
        System.out.println("contiune keyword loop"  );
        while (true) {
            System.out.println(i);
            i++;
            if (i == 11) {
                break;
            }
        }
    }
}

class ExampleContiune {
    int i = 0;

    void Cont() {
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}