package lessons.lesson3.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int x = 0;
        int[] array = {1, 5, 8, 50, -7};
        int[] array2 = new int[4];

        array[1] = 554;

        for (int item : array ) {
            System.out.println(item);
        }

        for (int i = 0 ; i < array.length; i++){//начало итерауии

            System.out.println("array["+ i + "] " + array[i] * 5);
        }
    }
}
