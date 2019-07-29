package lessons.lesson5_2;

import lessons.lesson5_2.animal.Animal;
import lessons.lesson5_2.animal.Cat;
import lessons.lesson5_2.animal.Dog;
import lessons.lesson5_2.vehicle.Bycicle;
import lessons.lesson5_2.vehicle.Scateboard;
import lessons.lesson5_2.vehicle.car.Car;
import lessons.lesson5_2.vehicle.car.Djeep;
import lessons.lesson5_2.vehicle.car.SuperCar;

import java.util.Calendar;

public class Main {
    static void example2(){
        Cat cat = new Cat("Kitty", 2, ">>>-<<<");
        Dog dog = new Dog("Billy", 3, 4);

        cat.sound();
        dog.sound();
    }

    public static void main(String[] args) {
        example2();

        example3();
    }

    private static void example3() {
        Bycicle bycicle = new Bycicle(25, 15);
        Scateboard scateboard = new Scateboard(12, 4);
        Car car = new Car(100, 12);
        Djeep djeep = new Djeep(95,2200);
        SuperCar superCar = new SuperCar(130, 1600);

        bycicle.move();
        scateboard.move();
        car.move();
        djeep.move();
        superCar.move();

        System.out.println();
        superCar.superSpeed();
        superCar.move();

        if (bycicle.compareTo(bycicle) == 0){
            System.out.println("it's the same bycicle!");
        }
    }
}
