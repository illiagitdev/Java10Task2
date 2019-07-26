package lessons.lesson3.Arrays;

import java.util.Scanner;

public class BrakeExample {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 323, -54, 999, -23};

        System.out.print("Введіть число: ");
        Scanner line = new Scanner(System.in);

        int x = line.nextInt();
        for (int i = 0; i < array.length; i++){
            if(x == array[i]) {
                System.out.println("X знайдено. Його індекс = " + i);
                break;
            }
        }

        System.out.println("The end!");
    }
}
