package lessons.lesson5_3;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesMain {
    public static void main(String[] args) {
//        writeExample();

//        readExample();

        loadUserDataExample();
        }

    private static void loadUserDataExample() {
        UserDataReader userData = new UserDataReader("files/lesson5_3/userData.txt");
        try {
            userData.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        userData.show();
    }

    private static void readExample() {
        MyFileRead read = new MyFileRead("files" + File.separatorChar + "lesson5_3" + File.separatorChar +
                "readExample.txt");
        System.out.println(read.read());
    }

    static void writeExample(){
        MyFileWriter writer = new MyFileWriter("files" + File.separatorChar + "lesson5_3" + File.separatorChar +
                "inputExample.txt");
        writer.write("123\n000\n   +++", true);
    }
}
