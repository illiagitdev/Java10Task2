package lessons.lesson8_1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    static String[] book = new String[]{
            "Page0: htst shtshh stshsbf",
            "Page1: gsfgaghyj d55sh",
            "Page2: h4557uwtrshh   tsrh5",
            "Page3: mbcvbcj ryys5u08r",
            "Page4: jmvchzrarw34 ",
            "Page5:  y7  fgj djdj ",
            "Page6: jgf7   673yrt"
    };

    static AtomicInteger atomicPage = new AtomicInteger(0);
    static Runnable onUpdate = () -> {
        System.out.println(book[atomicPage.get()]);
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            int page = scanner.nextInt();
            atomicPage.set(page);
        }
    }
}
