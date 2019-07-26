package lessons.lesson7.json;

import com.alibaba.fastjson.JSON;
import lessons.lesson5_2.animal.Dog;

public class JsonExample {
    public static String serializeObject(Dog dog) {
        String json = JSON.toJSONString(dog);
        return json;
    }

    static Dog parseFromJSON(String json) {
        Dog dog = JSON.parseObject(json, Dog.class);
        return dog;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Blond", 5);
        Dog dog2 = new Dog("Nick", 3);

        String json1 = serializeObject(dog1);
        System.out.println(json1);

        String json2 = serializeObject(dog2);
        System.out.println(json2);

        Dog dog = parseFromJSON(json1);

        System.out.println(dog.toString())   ;

    }
}
