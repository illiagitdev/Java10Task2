package lessons.lesson5_3.dinosauria;

import lessons.lesson5_3.dinosauria.gradation.Dinosaures;
import lessons.lesson5_3.dinosauria.gradation.coelurosauria.Maniraptora;
import lessons.lesson5_3.dinosauria.gradation.coelurosauria.Predatorial;
import lessons.lesson5_3.dinosauria.gradation.coelurosauria.tyrannosauroidea.Tyrannosauridea;

public class Main {
    public static void main(String[] args) {

        Dinosaures[] list = {new Tyrannosauridea(), new Maniraptora()};
        if(list[0] instanceof Predatorial){
            System.out.println("It's a predator!");
        }
    }
}
