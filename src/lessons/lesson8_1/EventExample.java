package lessons.lesson8_1;

public class EventExample {

    public static void download(Runnable onComplete) {
        System.out.println("Loading has started!");
        try {
            Thread.sleep(2000); // download simulation, thread sleep 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loading has finished!!");
        onComplete.run();
    }
    public static void main(String[] args) {

        Runnable onComplete = ()->{
            System.out.println("Inform user on completed download.");
        };

        Runnable onComplete2 = ()->{
            System.out.println("Download completed  !!!");
        };

        Runnable downloadInThread = ()->{
          download(onComplete2);
        };

        new Thread(downloadInThread).start();
    }
}
