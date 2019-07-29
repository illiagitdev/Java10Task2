package lessons.lesson7.json.entity;

import java.util.ArrayList;

public class Group {
    public String name;
    public String description;

    public ArrayList<User> users;

    public Group(String name, String description, ArrayList<User> users) {
        this.name = name;
        this.description = description;
        this.users = users;
    }
}
