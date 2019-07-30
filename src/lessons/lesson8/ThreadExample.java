package lessons.lesson8;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               // code executed in thread
                System.out.println("Hello world from new thread!");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
