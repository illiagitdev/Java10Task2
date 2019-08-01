package lessons.lesson8;

public class ThreadMethodExample {

    static Thread showTimer(int timer){
        Thread thread;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while(seconds<timer){
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " " + ++seconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        return thread;
    }

    public static void main(String[] args) throws InterruptedException {
        showTimer(2).join();

        showTimer(5).join();

        showTimer(1).join();

        for (int i = 0; i<3;i++){
            int f = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("i + i = " + (f+f));
                }
            }).start();
        }

        // lambda
        new Thread(()-> {
                System.out.println("i + i = " + (1+1));
            }
        ).start();

        Runnable r = () -> {System.out.println("i + i = " + (1+1));};
        new Thread(r).start();
    }
}
