package lessons.lesson8;

public class MultyThreadWaitExample {
    static int x = 3;
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
            System.out.println(Thread.currentThread() + " -> Out");
        }
    };

    public static void main(String[] args) throws InterruptedException {

        Thread thread;

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : wait thread's end");
        thread.join();
        System.out.println("main thread : release 1");

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : wait thread's end");
        thread.join();
        System.out.println("main thread : release 2");

        thread = new Thread(runnable);
        thread.start();
        System.out.println("main thread : wait thread's end");
        thread.join();
        System.out.println("main thread : release 3");

        System.out.println("main thread : the end");
    }
}
