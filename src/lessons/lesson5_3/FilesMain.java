package lessons.lesson5_3;

public class FilesMain {
    public static void main(String[] args) {
        MyFileWriter writer = new MyFileWriter("files/lesson5_3/inputExample.txt");
        writer.write("123\n000\n   +++");
    }
}
