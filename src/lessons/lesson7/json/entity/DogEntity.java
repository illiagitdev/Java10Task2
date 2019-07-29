package lessons.lesson7.json.entity;

public class DogEntity {
    public String name;
    public  int age;

    public DogEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DogEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
