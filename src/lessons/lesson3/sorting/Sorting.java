package lessons.lesson3.sorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        //count steps in sorting
        int countSteps = 0;
        int countShifts = 0;
        int size = 0;

        Scanner scan = new Scanner(System.in);
        SortingInventory line = new SortingInventory();

        //creating array and see what inside{
        System.out.print("Enter array length: ");
        //todo: add check for numeric input: done!!!!!
        if(scan.hasNextInt()){
            size = scan.nextInt();
        }else {
            System.out.println("Not integer");
            System.exit(0);
        }

        int[] testArray = line.CreateArray(size);

        //expose new array
        for (int x:testArray) {
            System.out.print(x + "  ");
        }
        System.out.println("\n");


        //sort this array
        int[] testBubble = line.BubbleSort(testArray);
        for (int x:testBubble) {
            System.out.print(x + "  ");
        }
        System.out.println("\n");
        line.ShowSteps();

        System.out.println("\n");
        /**Quick Sort algo*/
        //sort this array
        int[] testArray1 = line.CreateArray(size);
        int[] testQSAlgo = line.QuickSort(testArray1, 0, testArray.length - 1);
        for (int x:testQSAlgo) {
            System.out.print(x + "  ");
        }
        System.out.println("\n");
        line.ShowQSSteps();

    }
}
