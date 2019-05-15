package lessons.lesson3.sorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        //count steps in sorting
        int countSteps = 0;
        int countShifts = 0;

        Scanner scan = new Scanner(System.in);
        SortingInventory line = new SortingInventory();

        //creating array and see what inside{
        System.out.print("Enter array length: ");
        int size = scan.nextInt();
        int[] testArray = line.CreateArray(size);
        //expose new array
        for (int x:testArray) {
            System.out.print(x + "  ");
        }
        System.out.println("\n\n");


        //sort this array
        testArray = line.BubbleSort(testArray);
        for (int x:testArray) {
            System.out.print(x + "  ");
        }
        System.out.println("\n\n");
        line.ShowSteps();

    }
}
