package lessons.lesson5_2.animal;

public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public abstract void sound();

    public abstract int genAge();
}
