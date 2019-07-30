package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lessons.lesson7.json.entity.DogEntity;
import lessons.lesson7.json.entity.Node;
import lessons.lesson7.json.entity.User;

import java.util.ArrayList;
import java.util.List;

public class GenericJSONExample {
    public static void main(String[] args) {
        ArrayList<Node<User>> nodes = new ArrayList<>();

        nodes.add(new Node<>(
                new User("Agent 007", User.Gender.male, 40),
                "best agent")
        );
        nodes.add(new Node<>(
                new User("Agent 008", User.Gender.female, 35),
                "best agent")
        ); nodes.add(new Node<>(
                new User("Agent 009", User.Gender.male, 54),
                "best agent")
        ); nodes.add(new Node<>(
                new User("Agent 004", User.Gender.male, 28),
                "best agent")
        );

        String json = JSON.toJSONString(nodes);
        System.out.println(json);


        ArrayList<Node<DogEntity>> nodes1 = new ArrayList<>();
        nodes1.add(new Node<>(new DogEntity("hghfh", 3), "my pet"));
        nodes1.add(new Node<>(new DogEntity("Donny", 5), "pet"));

        String json1 = JSON.toJSONString(nodes1);
        System.out.println(json1);

//        TypeReference<Node<User>> typeRef = new TypeReference<Node<User>>(){};
//        ArrayList<Node<User>> nodesClone = JSON.parseArray(json, typeRef);

//        System.out.println(nodesClone.toString());
    }
}
