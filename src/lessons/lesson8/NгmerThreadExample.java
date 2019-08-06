package lessons.lesson8;

public class NгmerThreadExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while (true){
                    try {
                        seconds++;
                        Thread.sleep(1000);
                        System.out.println(seconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
