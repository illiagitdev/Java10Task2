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

    static int countOfPageUpdate = 0;

    public static void main(String[] args) {
        SmartObject<Integer> page = new SmartObject<>();
        // 1 -----------------------------------------------
        page.getOnUpdate().add(() -> {
            System.out.println(book[page.getValue()]);
        });

        // 2 -------------------------------------------------
        Runnable runnableAnimation = () -> {
            System.out.println("Start sheets jump animation");
        };

        // 3 -------------------------------------------------
        Runnable onFifthUpdate = () -> {
            page.getOnUpdate().remove(runnableAnimation);
        };

        // 4 -------------------------------------------------
        Runnable onUpdate = () -> {
            countOfPageUpdate++;
            if (countOfPageUpdate >= 5) {
                onFifthUpdate.run();
            }
        };

        page.getOnUpdate().add(runnableAnimation);
        page.getOnUpdate().add(onUpdate);


        Scanner sc = new Scanner(System.in);
        while (true) {
            int userPage = sc.nextInt();
            page.setValue(userPage);
        }
    }
}
