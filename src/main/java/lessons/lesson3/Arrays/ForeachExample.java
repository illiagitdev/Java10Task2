package lessons.lesson3.Arrays;

public class ForeachExample {
    public static void main(String[] args) {
        String[] array = {"ghy", "tcyd", "rsx", "666"};

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "   ");

        for (String x: array
             ) {
            System.out.println(x);
        }
    }
}
