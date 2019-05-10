import java.io.Console;

public class Passport {
    public static void main(String[] args) {

        //person name
        String fName = null, lName = null;

        //gender & age
        String gender = null;
        int age = 0;

        //person location
        String locFrom = null, locCurrent = null;


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
