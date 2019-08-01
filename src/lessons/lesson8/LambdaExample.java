package lessons.lesson8;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable r = ()->System.out.println(Thread.currentThread().getName() + " lambda in one line");

        Runnable rr = ()->{
            System.out.println(Thread.currentThread().getName() + " multipleline lambda");
        };

        r.run();
        new Thread(r).start();
        rr.run();
        new Thread(rr).start();

        ITest tt = ()-> System.out.println("blabla");

        tt.blabla();
    }
}
