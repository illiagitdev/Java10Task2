package lessons.lesson8_1;

import java.util.concurrent.*;

public class TreadTasksExamples {

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int result = 0;

    private static void callable() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        int[] arr = {1, 42, 15, 86, 3, 7, 9, 15, 84, 3};

        Runnable r = new Runnable() {
            @Override
            public void run() {
                result = sum(arr);
            }
        };
        Future future = service.submit(r);
        future.get();//ожидаем завершения runnable
        System.out.println("Result runnable: " + result);


        Callable<Integer> c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return sum(arr);
            }
        };
        Future<Integer> future1 = service.submit(c);
        future1.get();
        System.out.println("Result callable: " + future1.get());
        service.shutdown();
    }

    private static void futureTask() throws ExecutionException, InterruptedException {
        int[] arr = new int[]{1, 42, 15, 86, 3, 7, 43, 15, 84, 3};
        FutureTask<Integer> task = new FutureTask<Integer>(() -> {
            return sum(arr);
        });

        new Thread(task).start();
//        task.run();
//        task.get();

        System.out.println("Result: " + task.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        callable();
        futureTask();
    }

}
