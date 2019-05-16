package lessons.lesson4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Factorial!!!\n\nEnter number:");

        Scanner scan = new Scanner(System.in);

        long num = scan.nextInt();
        System.out.println("\n\nFactorial(" + num + ") = " + Factorial(num));

        for (int i = 0; i <= 20 ; i++){
            System.out.println(i + "!" + " = " + Factorial((long) i));
        }
    }

    static long Factorial(long value){
        if(value == 0)
            return 1;
        return value * Factorial(value - 1);
    }
}
