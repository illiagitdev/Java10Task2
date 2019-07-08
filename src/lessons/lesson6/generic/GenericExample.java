package lessons.lesson6.generic;

import lessons.lesson5.Car;
import lessons.lesson5_3.polimorphism.animals.Cat;

public class GenericExample {
    public static void main(String[] args) {
        Dog<Cat> dog = new Dog<>();
        dog.obj = new Cat();

        Dog<Car> dog2 = new Dog<>();
        dog2.obj = new Car();

    }
}
