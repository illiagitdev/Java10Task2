package lessons.lesson6;

import lessons.lesson5_2.animal.Dog;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Dog> dogs = new HashMap<String, Dog>();

        dogs.put("dog1", new Dog("Den", 2));
        dogs.put("dog2", new Dog("Jessy", 1));
        dogs.put("dog3", new Dog("Donny", 4));

        Dog dog = dogs.get("dog2");
        System.out.println(dog.genAge());

        Dog dog1 = dogs.get("dog5");
        if (dog1 != null) {
            System.out.println(dog1.genAge());
        }
    }
}
