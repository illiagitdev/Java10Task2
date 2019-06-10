package lessons.lesson5_2.vehicle.car;

import lessons.lesson5_2.vehicle.Vehicle;

public class SuperCar extends Car {
    public SuperCar(float speed, float mass) {
        super(speed, mass);
    }

    public void superSpeed(){
        this.speed *=2;
    }
}
