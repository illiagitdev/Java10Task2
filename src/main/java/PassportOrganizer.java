import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PassportOrganizer {
    public void DoBuffer() throws IOException
    {
        //use BufferReader for input
        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));

        //person name
        String fName = null, lName = null;
        System.out.print("Enter First Name: ");
        fName = stream.readLine();

        System.out.print("Enter Last name: ");
        lName = stream.readLine();

        //gender & age
        String gender = null;
        System.out.print("Enter gender: ");
        gender = stream.readLine();

        String age = null;
        System.out.print("Your age: ");
        age = stream.readLine();

        //person location
        String locFrom = null, locCurrent = null;
        System.out.print("Place, where are you were born: ");
        locFrom = stream.readLine();

        System.out.print("Where are you live now: ");
        locCurrent = stream.readLine();

        ShowAll(fName, lName, gender, age,locFrom, locCurrent);
    }

    public void DoScanner() throws IOException
    {
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

        String age = null;
        System.out.print("Your age: ");
        age = in.nextLine();

        //person location
        String locFrom = null, locCurrent = null;
        System.out.print("Place, where are you were born: ");
        locFrom = in.nextLine();

        System.out.print("Where are you live now: ");
        locCurrent = in.nextLine();

        ShowAll(fName, lName, gender, age,locFrom, locCurrent);
    }

    private void ShowAll(String... data){
        //resulted output
        System.out.flush();

        System.out.println("----------------PASSPORT------------------");
        System.out.println("------------------------------------------");
        System.out.println("----");
        System.out.println("----Person: " + data[0] + " " + data[1]);
        System.out.println("----");
        System.out.println("----Gender: " + data[2] + ", age: " + data[3]);
        System.out.println("----");
        System.out.println("----Location: from " + data[4] + ", current: " + data[5]);
        System.out.println("----");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
    }

    private String ReadInput(){
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
