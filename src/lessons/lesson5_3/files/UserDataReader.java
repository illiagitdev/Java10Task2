package lessons.lesson5_3.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataReader {
    private String path;

    private int arrayLength;
    private String name;
    private int age;
    private String word;
    private int[] array;

    public UserDataReader(String path) {
        this.path = path;
    }

    public void read() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        arrayLength = scanner.nextInt();     //считали длину массива
        array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {  //считали массив
            array[i] = scanner.nextInt();
        }
        scanner.nextLine(); //переходимим на новий рядок

        name = scanner.nextLine();       //считали имя
        age = scanner.nextInt();            // считали возвраст

        scanner.nextLine();//переходимим на новий рядок

        word = scanner.nextLine();       //считали слово
        scanner.close();
    }

    public void show() {
        System.out.println("User name:\t\t" + name);
        System.out.println("User age:\t\t" + age);
        System.out.println("User favorite word:\t\t" + word);
        System.out.println("Array length:\t\t" + arrayLength);
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]" + array[i] + "   ");
        }
    }
}
