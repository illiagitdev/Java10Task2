package lessons.fractals.parts;

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

    public void writeLog(String txt){
        try {
            FileWriter writer = new FileWriter(path, true);
            //adding date to log file
            Date currentMoment = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd hh/mm/ss");
            String currMomentString = format.format(currentMoment.getTime());
            txt = currMomentString + txt;
            writer.write(txt);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("no file written!");
        }
    }
}
