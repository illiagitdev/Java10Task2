package lessons.lesson2;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String userName = scan.nextLine();

        //---------------------------------------------
        System.out.println("Введите число: ");
        int x = scan.nextInt();

        System.out.println("Спасибо " + userName +  ", вы ввели: " + x);

        //---------------------------------------------

        // allowed
        //x in <1000 or [2000:4000] or >5000

        System.out.println("ВВедите граници диапазонов...\n" +
                "redZoneLeft1, redZoneRight1, redZoneLeft2, redZoneRight2");
        int redZoneLeft1 = scan.nextInt();
        int redZoneRight1 = scan.nextInt();
        int redZoneLeft2 = scan.nextInt();
        int redZoneRight2 = scan.nextInt();

        boolean left, center, right;
        left = x < redZoneLeft1;
        center = x > redZoneRight1 && x < redZoneLeft2;
        right = x > redZoneRight2;

        boolean isIn = left || center || right;

        System.out.println("Входит в зеленый диапазон? - " + isIn + ", value = " + x);

        System.out.println("Спасибо " + userName +", что воспользывались нашей программой!");

    }
}
