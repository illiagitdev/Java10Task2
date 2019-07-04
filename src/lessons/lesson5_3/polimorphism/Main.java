package lessons.lesson5_3.polimorphism;

import lessons.lesson5_3.polimorphism.animals.Animal;
import lessons.lesson5_3.polimorphism.animals.Cat;
import lessons.lesson5_3.polimorphism.animals.Creature;
import lessons.lesson5_3.polimorphism.animals.Dog;

public class Main {
    public static void main(String[] args) {
//        example1();
//
//        example2();

        example3();
    }

    static void example3(){
        Cat cat = new Cat();
        if (cat instanceof Cat){
            System.out.println("cat is object of class Cat");
        }

        if (cat instanceof Animal){
            System.out.println("cat is object of class Animal");
        }

        if (cat instanceof Creature){
            System.out.println("cat is object of class Creature");
        }

        //--------------------
        if (Cat.class.isInstance(cat)){
            System.out.println("cat is object of class Cat");
        }

        if (Animal.class.isInstance(cat)){
            System.out.println("cat is object of class Animal");
        }

        if (Creature.class.isInstance(cat)){
            System.out.println("cat is object of class Creature");
        }

        //--------------------------
        if (cat.getClass().getName().equals(Cat.class.getName())){
            System.out.println("cat is object of class Cat");
        }

        if (cat.getClass().getName().equals(Animal.class.getName())){
            System.out.println("cat is object of class Animal");
        }

        if (cat.getClass().getName().equals(Creature.class.getName())){
            System.out.println("cat is object of class Creature");
        }
    }

    private static void example2() {
        Cat cat1 = new Cat();
        cat1.kitty = "ddd";

        Animal animal1 = cat1;
        Animal animal2 = new Dog();

        Cat cat = (Cat) animal1;
        System.out.println(cat.kitty);

        Creature creature1 = animal1;
        if (creature1 instanceof Cat){
            cat = (Cat)creature1;
        }

        System.out.println(cat.kitty);
    }

    private static void example1() {
        Animal[] animalsZoo = {new Cat(), new Dog(), new Cat(), new Dog()};

        for (Animal an : animalsZoo) {
            if (an instanceof Cat) {
                Cat cat = (Cat) an;
                System.out.println(cat.kitty);
            }
        }
    }
}
