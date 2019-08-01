package lessons.lesson8;

import java.util.concurrent.Semaphore;

public class ThreadSyncExample {
    static Semaphore semaphore = new Semaphore(2);

    static void writeDataInDatabase() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " wait for semaphore ");
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + " Semaphore get ");

        // write in database
        System.out.println(Thread.currentThread().getName() + " write in database...... ");
        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName() + " semaphore release  ");
        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " semaphore released ");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    writeDataInDatabase();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        writeDataInDatabase();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
            System.out.println(Thread.currentThread().getName() + " thread created " + i);
        }
    }
}
