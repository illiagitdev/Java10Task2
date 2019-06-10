package lessons.lesson5_2.vehicle;

public class Bycicle extends Vehicle implements Comparable<Bycicle>{
    public String bell = "dzin-dzin";

    public Bycicle(float speed, float mass) {
        super(speed, mass);
    }

    @Override
    public void move() {
        System.out.println("крутим педали" + speed);
    }

    @Override
    public int compareTo(Bycicle o) {
        return o.bell.equals(this.bell) ? 0 : -1;
    }
}
