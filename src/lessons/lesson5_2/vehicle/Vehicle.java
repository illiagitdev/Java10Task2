package lessons.lesson5_2.vehicle;

public abstract class Vehicle implements Movable{
    public float speed, mass;

    public Vehicle(float speed, float mass) {
        this.speed = speed;
        this.mass = mass;
    }
}
