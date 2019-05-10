import java.io.Console;
import java.util.Scanner;

public class Passport {
    public static void main(String[] args) {

        //use Scanner for input
        Scanner in = new Scanner(System.in);

        //person name
        String fName = null, lName = null;
        System.out.print("Enter First Name: ");
        fName = in.nextLine();
        System.out.print("Enter Last name: ");
        lName = in.nextLine();

        //gender & age
        String gender = null;
        System.out.print("Enter gender: ");
        gender = in.nextLine();
        int age = 0;
        System.out.print("Your age: ");
        age = in.nextInt();

        //person location
        String locFrom = null, locCurrent = null;
        System.out.print("Place, where you were born: ");
        locFrom = in.nextLine();
        System.out.print("Where you live now: ");
        locCurrent = in.nextLine();

        //resulted output
        System.out.flush();

        System.out.println("----------PASSPORT----------");
        System.out.println("----------------------------");
        System.out.println("----");
        System.out.println("----Person: "+ fName + " " + lName);
        System.out.println("----");
        System.out.println("----Gender: " + gender + ", age: " + age);
        System.out.println("----");
        System.out.println("----Location: from " + locFrom + ", current: " + locCurrent);
        System.out.println("----");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
    }
}
