package lessons.lesson5_2;

import lessons.lesson5_2.entities.A;
import lessons.lesson5_2.entities.B;

public class Empty {
    public static void main(String[] args) {
        A a = new A("abc", 100);
        B b = new B("Name", "bcd", 450);

        a.show();
        System.out.println();
        b.show();


    }
}
