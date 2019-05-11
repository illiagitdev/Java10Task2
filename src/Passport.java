import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
//import java.io.IOExeption;
//import java.io.InputStreamReader;

public class Passport {
    public static void main(String[] args) throws IOException
    {

        ///task 2 lesson1
        {
            //use Scanner for input
            Scanner in = new Scanner(System.in);

            BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));

            //person name
            String fName = null, lName = null;
            System.out.print("Enter First Name: ");
            //TODO: fix method ReadInput() - doesn't work correctly
            //fName = in.nextLine();
            fName = stream.readLine();

            System.out.print("Enter Last name: ");
            //lName = in.nextLine();
            lName = stream.readLine();

            //gender & age
            String gender = null;
            System.out.print("Enter gender: ");
            //gender = in.nextLine();
            gender = stream.readLine();

            int age = 0;
            System.out.print("Your age: ");
            age = in.nextInt();

            //person location
            //TODO: fis - skip reading first location
            String locFrom = null, locCurrent = null;
            System.out.print("Place, where you were born: ");
            //locFrom = in.nextLine();
            locFrom = stream.readLine();

            System.out.print("Where you live now: ");
            //locCurrent = in.nextLine();
            locCurrent = stream.readLine();

            //resulted output
            System.out.flush();

            System.out.println("----------PASSPORT----------");
            System.out.println("----------------------------");
            System.out.println("----");
            System.out.println("----Person: " + fName + " " + lName);
            System.out.println("----");
            System.out.println("----Gender: " + gender + ", age: " + age);
            System.out.println("----");
            System.out.println("----Location: from " + locFrom + ", current: " + locCurrent);
            System.out.println("----");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
        }



    }

    public static String ReadInput(){
        String line = null;
        Scanner in = new Scanner(System.in);

        getline:{
            while (true) {
                if (in.hasNext())
                    line = in.nextLine();
                if (line != null || line.isEmpty())
                    break getline;
                System.out.println(line);
            }
        }

        in.close();
        return line;
    }
}
