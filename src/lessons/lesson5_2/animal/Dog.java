package lessons.lesson5_2.animal;

public class Dog extends Animal{
    public int fangsCount;

    public Dog(String dsf, int i, int i1){
        super();
    }

    @Override
    public void sound() {
        System.out.println("Gav");
    }

    @Override
    public int genAge() {
        return age;
    }

    public Dog(String name, int age){
        super(name, age);
        this.fangsCount = fangsCount;
    }

    public Dog(int fangsCount) {
        this.fangsCount = fangsCount;
    }
}
