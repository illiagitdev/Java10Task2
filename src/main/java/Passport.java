import java.io.IOException;
import java.util.Scanner;

public class Passport {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Select function for reading input:");
        System.out.println("1 - Scanner;\t\t2 - BufferReader");
        Scanner select = new Scanner(System.in);
        String tag = select.nextLine();

        PassportOrganizer work = new PassportOrganizer();

        switch (tag){
            case "1":{
                work.DoScanner();
                break;
            }
            case "2":{
                work.DoBuffer();
                break;
            }
            default:{
                System.out.println("Wrong selection :(");
                break;
            }
        }

    }
}
