package lessons.lesson2;

public class OperatorsExample {
    public static void main(String[] args) {

        int a = 2, b = 5;

        int x = a + b;
        x -= b; // x = x - b;
        x += b;
        x *= b;
        x /= b;

        float c = (float)b / a;
        System.out.println("c = " + c);

        x = 10 + 10 * 2;
        System.out.println("x = " + x);

        x = 0;

        int z = 8;
        System.out.println("8 % 5 = " + z % 5);
    }
}
