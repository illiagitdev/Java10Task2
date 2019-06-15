package lessons.lesson5_3.files;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public String path;

    public MyFileWriter(String path) {
        this.path = path;
    }


    //    write to file directory - rewrite every time it called
    public boolean write(String txt) {
        return write(txt, false);
    }

    //    write to tge end of an existing file
    public boolean write(String txt, boolean append) {
        try {
            FileWriter writer = new FileWriter(path, append);
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
