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
