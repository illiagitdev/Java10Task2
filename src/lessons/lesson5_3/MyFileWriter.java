package lessons.lesson5_3;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public String path;

    public MyFileWriter(String patg) {
        this.path = patg;
    }

    public boolean write(String txt){
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
