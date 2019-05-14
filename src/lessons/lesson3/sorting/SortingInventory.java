package lessons.lesson3.sorting;

public class SortingInventory implements SorttingInterface
{
    static private int countSteps = 0;
    static private int countShifts = 0;
    @java.lang.Override
    public void BubbleSort(int[] numbers) {
        int k =numbers.length;
        for (int j = 0; j < k; j++){
            for (int i = 0; i < k - j -2; i++){
                if(numbers[i] < numbers[i + 1]){
                    Swap(numbers[i], numbers[i + 1]);
                    countShifts++;
                }
                countSteps++;
            }
        }
       //return numbers;
    }

    private void Swap(int a, int b) {
        int z = a;
        a = b;
        b = z;
    }

    @java.lang.Override
    public double[] BubbleSort(double[] numbers) {
        int k =numbers.length;
        for (int j = 0; j < k; j++){
            for (int i = 0; i < k - j -2; i++){
                if(numbers[i] < numbers[i + 1]){
                    Swap(numbers[i], numbers[i + 1]);
                    countShifts++;
                }
                countSteps++;
            }
        }
        return numbers;
    }

    private void Swap(double a, double b) {
        double z = a;
        a = b;
        b = z;
    }
}
