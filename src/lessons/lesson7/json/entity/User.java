package lessons.lesson7.json.entity;

public class User {
    public String name;
    public Gender gender;
    public int age;


    public enum Gender{
        male, female
    }

    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
