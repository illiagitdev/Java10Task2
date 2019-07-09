package lessons.lesson7.enumDemo;

public class EnumExample {

    static public void dogType(DogType type) {
        if (type == DogType.Dalmatian) {
            System.out.println("type is Damatian");
        }
        if (type == DogType.Kokker) {
            System.out.println("type is Kokker");
        }
        if (type == DogType.Bobik) {
            System.out.println("type is Bobik");
        }
        if (type == DogType.Sharik) {
            System.out.println("type is Sharik");
        }
    }

    public static void main(String[] args) {
        DogType dogType = DogType.Dalmatian;

        dogType(DogType.Sharik);
        dogType(dogType);
    }
}
