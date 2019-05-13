package lessons.lesson3;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        //строка длиной 5 символов == джекпот
        // строка из 3 символов = = провал
        int leng = str.length();
        System.out.println("длина строки " + leng);

        if(leng == 5){
            System.out.println("ДЖЕКПОТ!!!");
        }else if (leng == 3){
            System.out.println("провал!");
        }

    }
}
