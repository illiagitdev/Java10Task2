package lessons.lesson8_1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 20; i++) {
            service.submit(() -> {
                System.out.println("Hello from thread pool :D");
            });
        }

        service.shutdown();
    }
}
