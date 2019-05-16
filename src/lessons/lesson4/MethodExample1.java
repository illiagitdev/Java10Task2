package lessons.lesson4;

public class MethodExample1 {

    static int x = 100;     //global

    public static void main(String[] args) {
        MethodExample.printArray(MethodExample.CreateArray(8));

        System.out.println(MethodExample.arrayToString(MethodExample.CreateArray(8), 5));
        ;

        float x = 3; //local

        {
            int x2 = 44;
        }
        x = 50;//local

        System.out.println(x);//local
        printHello();
    }

    static void printHello() {
        x = 200;    //global
        System.out.println(x);
    }
}
