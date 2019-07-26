package lessons.lesson6;

import lessons.lesson5_2.animal.Dog;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Dog> linkedList = new LinkedList<>();

        linkedList.addLast(new Dog("dsf", 5));
        linkedList.addLast(new Dog("dewd", 12));
        linkedList.addLast(new Dog("aaa", 1));

        Iterator<Dog> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            Dog dog = iterator.next();
            System.out.println(dog.name);
        }
    }
}
