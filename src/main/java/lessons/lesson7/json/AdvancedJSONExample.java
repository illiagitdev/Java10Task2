package lessons.lesson7.json;

import lessons.lesson7.json.entity.User;

import java.util.ArrayList;

public class AdvancedJSONExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Tom", User.Gender.male, 43));
        users.add(new User());
    }

}
