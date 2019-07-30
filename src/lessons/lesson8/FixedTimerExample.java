package lessons.lesson8;

import java.util.Scanner;

public class FixedTimerExample {
    static int x = 10;
    static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int seconds = 0;
            while (seconds < x){
                try {
                    seconds++;
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread() + " " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Thread thread;
//        x = scan.nextInt();
        thread = new Thread(runnable);
        thread.start();

//        x = scan.nextInt();
        thread = new Thread(runnable);
        thread.start();

//        x = scan.nextInt();
        thread = new Thread(runnable);
        thread.start();
    }
}
