package lessons.lesson2;

public class BinaryOperator {
    public static void main(String[] args) {

        int x = 2, y = 0b0000_0000_0000_0000_0000_000_0000_1101;
        System.out.println("x = " + x + ", y = " + y);

        byte q = 0b0000_0010;
        byte w = 0b0000_0000;

        System.out.println("q | w = " + (q | w));
        int z = 34;
        System.out.println("z(bit) = " + Integer.toString(z, 2));

        System.out.println();

        q =-17;
        System.out.println("q >> 3 = " +  Integer.toString((q >> 3), 2) + ", q = " + (byte)(q >> 3 ));
        System.out.println("q >>> 3 = " + Integer.toString((q >>> 3), 2)+ ", q = " + (byte)(q >>> 3 ));

    }
}
