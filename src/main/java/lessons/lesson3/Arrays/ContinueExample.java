package lessons.lesson3.Arrays;

public class ContinueExample {
    public static void main(String[] args) {

        int[] x = {1, 3, 5, 0, 323, -54, 999, 0, -23};

        int sum = 0, count = 0;

        //--------------------
        for (int item:x) {
            if(item > 0)
            {
                sum +=item;
            }
            count++;
        }
        //------------------
        System.out.println("Кроків: " + count + ". сума = " + sum);

        sum = 0;
        count = 0;

        for (int item:x) {
            if(item < 0)
                continue;
            sum +=item;
            count++;
        }

        System.out.println("Кроків: " + count + ". сума = " + sum);
    }
}
