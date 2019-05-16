package lessons.lesson4;

public class MethodExample1 {

    static int x = 100;
    public static void main(String[] args) {
        MethodExample.printArray(MethodExample.CreateArray(8));

        System.out.println(MethodExample.arrayToString(MethodExample.CreateArray(8),5));;

        float x = 3;

        {
            int x2 = 44;
        }
        x = 50;

        System.out.println(x);
        printHello();
    }

    static void printHello(){
        x = 200;
        System.out.println(x);
    }
}
