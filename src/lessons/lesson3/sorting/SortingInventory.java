package lessons.lesson3.sorting;

import java.util.Random;

public class SortingInventory implements SorttingInterface
{
    static int countSteps = 0;
    static int countShifts = 0;
    @java.lang.Override
    public int[] BubbleSort(int[] numbers) {
        countShifts = 0;
        countSteps = 0;
        int k =numbers.length;
        for (int j = 0; j < k; j++){
            for (int i = 0; i < k - j -1; i++){
                if(numbers[i] > numbers[i + 1]){
                    numbers[i] = Swap(numbers[i + 1], numbers[i + 1] = numbers[i]);
                    countShifts++;
                }
                countSteps++;
            }
        }
       return numbers;
    }

    private int Swap(int returnValue, int swapValue) {
        return returnValue;
    }

    @java.lang.Override
    public double[] BubbleSort(double[] numbers) {
        countShifts = 0;
        countSteps = 0;
        int k =numbers.length;
        for (int j = 0; j < k; j++){
            for (int i = 0; i < k - j -1; i++){
                if(numbers[i] > numbers[i + 1]){
                    numbers[i] = Swap(numbers[i + 1], numbers[i + 1] = numbers[i]);
                    countShifts++;
                }
                countSteps++;
            }
        }
        return numbers;
    }

    @Override
    public int[] QuickSort(int[] numbers) {
        int[] array = new int[numbers.length];
        array = QuickSorting(numbers, 0 , numbers.length);
        return array;
    }

    private int[] QuickSorting(int[] numbers, int lo, int hi) {
        //int p = Partition(numbers)
        int[] ints = new int[0];
        return ints;
    }

    @Override
    public double[] QuickSort(double[] numbers) {
        return new double[0];
    }

    @Override
    public int[] CreateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(55);
        }
        return array;
    }

    private double Swap(double returnValue, double swapValue) {
        return returnValue;
    }

    public void ShowSteps(){
        System.out.println("Total steps - " + countSteps + " (shifts - " + countShifts + ")");
    }



}
