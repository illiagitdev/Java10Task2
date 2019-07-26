package lessons.lesson5_2.vehicle;

public class Scateboard extends Vehicle{
    public String emery = "nazdak";
    public Scateboard(float speed, float mass) {
        super(speed, mass);
    }

    @Override
    public void move() {
        System.out.println("Push with leg!" + speed);
    }
}
