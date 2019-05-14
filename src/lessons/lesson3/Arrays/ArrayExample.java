package lessons.lesson3.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int x = 0;
        int[] array = {1, 5, 8};
        int[] array2 = new int[4];

        System.out.println(array[1]);
        System.out.println(array[2]);

        for (int item : array ) {
            System.out.println(item);
        }
    }
}
