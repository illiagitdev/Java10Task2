package lessons.lesson6;

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

//        queue.push(1);
//        queue.peek();   //  read first element
//        queue.pop();    //read by stack principe and delete
//        queue.poll(); //read first and delete

        int x = 1;
        queue.push(x++);
        queue.push(x++);
        queue.push(x++);
        queue.push(x++);

        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());

        queue.push(x++);
        queue.push(x++);
        queue.push(x++);

        System.out.println(queue.pollLast());

        queue.push(x++);

        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());

        queue.push(x++);
        queue.push(x++);

        System.out.println(queue.pollLast());

        queue.push(x++);
        queue.push(x++);
        queue.push(x++);

        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());

        while (!queue.isEmpty()){
            System.out.println(queue.pollLast());
        }

        System.out.println("Last x:" + --x);
    }
}
