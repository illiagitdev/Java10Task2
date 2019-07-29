package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import lessons.lesson7.json.entity.Group;
import lessons.lesson7.json.entity.User;

import java.util.ArrayList;

public class AdvancedJSONExample {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Tom", User.Gender.male, 25));
        users.add(new User("Elen", User.Gender.female, 45));
        users.add(new User("Bob", User.Gender.male, 19));

        Group group = new Group("basketball team","bla bla blaaa", users);

        String json = JSON.toJSONString(group);
        System.out.println(json);
    }
}
