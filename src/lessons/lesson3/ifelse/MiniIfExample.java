package lessons.lesson3.ifelse;

import java.util.Scanner;

public class MiniIfExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("введите строку");
        String line = scan.nextLine();
        String result = null;

        //-----------------------
        String resultV1 = line.length() == 5 ? "ДЖЕКПОТ!!!" : "провал!";
        System.out.println(resultV1);
        //-----------------------



        //-----------------------
        System.out.println( line.length() == 5 ? "ДЖЕКПОТ!!!" : (line.length() == 3 ? "провал!": ""));
        //-----------------------

        //-----------------------
        if(line.length() == 5){
            result = "ДЖЕКПОТ!!!";
        }else {
            result = "провал!";
        }
        //----------------------------

        System.out.println(result);
    }
}
