package lessons.lesson3.sorting;

import java.util.Random;

public class SortingInventory implements SorttingInterface {
    static int countSteps = 0;
    static int countShifts = 0;
    static int countQSAlgo = 0;

    @java.lang.Override
    public int[] BubbleSort(int[] numbers) {
        countShifts = 0;
        countSteps = 0;
        int k = numbers.length;
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < k - j - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
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
        int k = numbers.length;
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < k - j - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    numbers[i] = Swap(numbers[i + 1], numbers[i + 1] = numbers[i]);
                    countShifts++;
                }
                countSteps++;
            }
        }
        return numbers;
    }

    @Override
    /**Quick Sort
     *
     */
    public int[] QuickSort(int[] numbers, int lo, int hi) {
        if (lo < hi) {
            int p = Partition(numbers, lo, hi);//0;
            QuickSort(numbers, lo, p);
            QuickSort(numbers, p + 1, hi);
        }
        return numbers;
    }

    private int Partition(int[] numbers, int lo, int hi) {
        int pivot = numbers[lo + (hi - lo)/2];
        int i = lo - 1, j = hi + 1;
        while(true){
            do{i++;}        while (numbers[i] < pivot);
            do{j--;}        while (numbers[j] > pivot);
            if(i >= j)return j;
            numbers[i] = Swap(numbers[j], numbers[j] = numbers[i]);
            countQSAlgo++;
        }
        }

    @Override
    public double[] QuickSort(double[] numbers, int lo, int hi) {
        if (lo < hi) {
            int p = Partition(numbers, lo, hi);//0;
            QuickSort(numbers, lo, p);
            QuickSort(numbers, p + 1, hi);
        }
        return numbers;
    }

    private int Partition(double[] numbers, int lo, int hi) {
        double pivot = numbers[lo + (hi - lo)/2];
        int i = lo - 1, j = hi + 1;
        while(true){
            do{i++;}        while (numbers[i] < pivot);
            do{j--;}        while (numbers[j] > pivot);
            if(i >= j)return j;
            numbers[i] = Swap(numbers[j], numbers[j] = numbers[i]);
            countQSAlgo++;
        }
    }

    @Override
    /**Create array with random values
     * @param size - size of the array
     */
    public int[] CreateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(55);
        }
        return array;
    }

    /**Working SWAP function
     *
     * @param returnValue - thiss value are return in the end
     * @param swapValue - [swapValue = returnValue] - that should be on the second argument place :)
     * @return
     */
    private double Swap(double returnValue, double swapValue) {
        return returnValue;
    }

    public void ShowSteps() {
        System.out.println("Total steps - " + countSteps + " (shifts - " + countShifts + ")");
    }

    public void ShowQSSteps() {
        System.out.println("Total steps - " + countQSAlgo);
    }
}
