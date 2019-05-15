package lessons.lesson3.sorting;

public class SortingTest {
    public static void main(String[] args) {
        int[] array1 = {4,5,2,7,9,12,77,41,23,89,54,1,0,-8,5,112,85,4,0};
        double[] array2 = {-78,0.2,87,45.89,12.5,-78.1,0,0.78,7.25,45,.12,7};

        SorttingInterface test = new SortingInventory();
        test.BubbleSort(array1);

        for (int a: array1) {
            System.out.println(a);
        }

        double[] xarray = test.BubbleSort(array2);

        for (double a: xarray) {
            System.out.println(a);
        }
    }
}
