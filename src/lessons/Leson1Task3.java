package lessons;

import java.util.Scanner;

public class Leson1Task3 {
    public static void main(String[] args) {
        ///task 3 lesson1
        {
            Scanner in2 = new Scanner(System.in);
            System.out.print("Enter first number: x = ");
            //todo: add check for numeric input
            double operand1 = in2.nextDouble();

            System.out.print("Enter second number: y = ");
            double operand2 = in2.nextDouble();
            System.out.println("-----------------------------------");
            System.out.println("----");
            System.out.println("---- x + y = " + (operand1 + operand2));
            System.out.println("----");
            System.out.println("---- x * y = " + (operand1 * operand2));
            System.out.println("----");
            System.out.println("---- x / y = " + (operand1 / operand2));
            System.out.println("----");
            System.out.println("---- x - y = " + (operand1 - operand2));
            System.out.println("----");
            System.out.println("---- x % y = " + (operand1 % operand2));
            System.out.println("----");
            System.out.println("---- x == y = " + (operand1 == operand2));
            System.out.println("----");
            System.out.println("---- x < y = " + (operand1 < operand2));
            System.out.println("----");
            System.out.println("---- x > y = " + (operand1 > operand2));
            System.out.println("----");
            System.out.println("--------------------------------------");
        }
    }
}
