package lessons.lesson5_2.animal;

public class Cat extends Animal{
    public String vibrissae;

    public Cat(String vibrissae) {
        super();
        this.vibrissae = vibrissae;
    }

    public Cat(String name, int age, String vibrissae) {
        super(name, age);
        this.vibrissae = vibrissae;
    }

    @Override
    public void sound() {
        System.out.println("Myau");
    }
}
