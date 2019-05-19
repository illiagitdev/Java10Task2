package lessons.lesson5;

public class Car {
    //  public - доступно всем
    //  protected - доступен в єтом класе *
    //  private - доступен только в єтом класе

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

    }

    public static void sayHello(){
        System.out.println("Hello!");
    }
}
