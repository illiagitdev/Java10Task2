package lessons.lesson4;

import java.util.Random;

public class MethodExample {

    public  static void PrintHello(){        System.out.println("Hello! ");    }

    public  static void printArray(int[] array){
        PrintHello();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " "); }
        System.out.println();
        PrintHello();
    }

    public  static String arrayToString(int[] array){
        return arrayToString(array, array.length);
    }

    public  static String arrayToString(int[] array, int count){
        if(count<0)
            throw new IllegalArgumentException("count < 0!!!");
        String result = "";
        for (int i = 0; i < (array.length >= count ? count : array.length); i++){
            result += (array[i] + " "); }
        return result;
    }


    public  static int[] CreateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(55);
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {1, 26, 48, 0, 5};
        printArray(array);
        PrintHello();
        PrintHello();

        int[] array1 = {0, 54, 1, 26, 48, 0, 5};
        printArray(array1);

        int[] array2 = CreateArray(7);
        System.out.println(arrayToString(array2));
    }
}
