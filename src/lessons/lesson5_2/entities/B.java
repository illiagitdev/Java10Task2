package lessons.lesson5_2.entities;

public class B extends A{
    String name;

    public B(String name, String text, int value){
        super(text, value);
        this.name = name;
    }

    @Override
    public void show(){
        System.out.println("Name: " + name);
        super.show();
    }
}
