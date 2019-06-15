package lessons.lesson5_3;

import java.io.*;
import java.util.Scanner;

public class MyFileRead {
    private String path;

    public MyFileRead(String path) {
        this.path = path;
    }

    public String read() {
        try {
            FileInputStream stream = new FileInputStream(path);
            Scanner scanner = new Scanner(stream);
            scanner.useDelimiter("\\Z"); // indicate on end of the file
            String data = scanner.next();
            scanner.close();
            return data;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
