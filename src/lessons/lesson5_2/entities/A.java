package lessons.lesson5_2.entities;

public class A {
    private String text;
    protected int value;

    public A(){}

    public A(String text, int value){
        this.text = text;
        this.value = value;
    }

    public void show(){
        System.out.println("text: " + text);
        System.out.println("value: " + value);
    }
}
