package lessons.lesson5;

public class Main {

    static public void ConstructExample() {
        Car car1 = new Car();
        Car car2 = new Car("222",1000);
        Car car3 = new Car("333", 2000);
        Car car4 = new Car("444");

        car1.show();
        car2.show();
        car3.show();
        car4.show();
    }

    public static void staticExample(){
        //Car.sayHello();

        System.out.println("lastName - " + Car.lastName);
        Car car1 = new Car();
        System.out.println("lastName - " + Car.lastName);

        Car car2 = new Car("super car");
        System.out.println("lastName - " + Car.lastName);

        Car car3 = new Car("my favorite car");
        System.out.println("lastName - " + Car.lastName);

        //car1.show();
        //Car.sayHello();

        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        //ConstructExample();
        //staticExample();

        Car car = new Car("HotWheel");

        car.wheels[1] = new Wheel("Italy");
        car.wheels[1].setPrice(5055);
        car.show();
    }
}
