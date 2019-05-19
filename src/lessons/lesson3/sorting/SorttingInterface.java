package lessons.lesson3.sorting;

public interface SorttingInterface {
    static int countSteps = 0;

    public int[] BubbleSort(int[] numbers);
    public double[] BubbleSort(double[] numbers);

    public int[] QuickSort(int[] numbers, int lo, int hi);
    public double[] QuickSort(double[] numbers, int lo, int hi);

    public int[] CreateArray(int size);
}
