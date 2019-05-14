package lessons.lesson3.ifelse;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        if(x % 2 == 0){
            System.out.println("Число "+ x + " кратне 2");
        }
        else {
            System.out.println("Число " + x + " не кратне 2.");
        }
    }
}
