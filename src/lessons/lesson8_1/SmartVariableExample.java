package lessons.lesson8_1;

import java.util.Scanner;

public class SmartVariableExample {

    static String[] book = new String[]{
            "Page0: htst shtshh stshsbf",
            "Page1: gsfgaghyj d55sh",
            "Page2: h4557uwtrshh   tsrh5",
            "Page3: mbcvbcj ryys5u08r",
            "Page4: jmvchzrarw34 ",
            "Page5:  y7  fgj djdj ",
            "Page6: jgf7   673yrt"
    };

    public static void main(String[] args) {
        SmartOvject<Integer> page = new SmartOvject<>();
        page.getOnUpdate().add(()->{
            System.out.println(book[page.getValue()]);
        });

        Scanner sc = new Scanner(System.in);
        while (true){
            int userPage = sc.nextInt();
            page.setValue(userPage);
        }
    }
}
