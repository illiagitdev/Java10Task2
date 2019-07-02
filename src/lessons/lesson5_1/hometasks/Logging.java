package lessons.lesson5_1.hometasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Date;

public class Logging {
    private String path;

    public Logging(String path) {
        this.path = path;
    }

    public Logging(){path = "files" + File.separatorChar + "log" + File.separatorChar +
            "someLog.txt";}

    public boolean writeLog(String txt){
        return write(txt, true);
    }

    public boolean write(String txt, boolean append){
        try {
            FileWriter writer = new FileWriter(path, append);
            //adding date to log file
            Date currentMoment = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss.sss ");
            String currMomentString = format.format(currentMoment.getTime());
            txt = currMomentString + txt + "\n";
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("no file written!");
            return false;
        }
        return true;
    }
}
