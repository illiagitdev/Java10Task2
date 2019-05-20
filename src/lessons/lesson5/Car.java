package lessons.lesson5;

public class Car {
    //  public - доступно всем
    //  protected - доступен в єтом класе *
    //  private - доступен только в єтом класе

    public Wheel[] wheels = {
            new Wheel("China"),
            new Wheel("Ukraine"),
            new Wheel("China"),
            new Wheel("Japan")};

    public  static  String lastName = "default";
    public String name = "444";
    public int price;

    public Car() {
        this("no name");
    }

    public Car(String name)    {
        this(name, 0);
    }

    public Car(String name, int price) {
        this.name = name;
        lastName = name;
        this.price = price;
    }

    public void show(){
        System.out.println("Name " + name + ", price: " + price);
        System.out.println("Wheels:");
        for (int i = 0; i <wheels.length;i++){
            Wheel wheel = wheels[i];
            System.out.println("\t [" + (i+1) +
                    "] madeIn: " + wheel.getMadeIn() +
                    "\tprice = " + wheel.getPrice());
        }
    }

    public static void sayHello(){
        System.out.println("Hello!");
    }
}
