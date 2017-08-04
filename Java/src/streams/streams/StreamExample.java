package streams;

import java.util.*;

/**
 * Created by prasad on 15/6/17.
 */

class Person{

    private String name;
    private int age;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

public class StreamExample {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<Person>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            //person.setPlace();
            person.setAge(((new Random().nextInt()) % 100) + 1);
            person.setPlace(getRandomString());
            personList.add(person);
        }
        Collection<Person> personCollection = new LinkedList<>();
        //personList.stream().filter(person -> person.getAge() > 18).collect(p);
    }

    private static String getRandomString() {
        return UUID.randomUUID().toString();
    }
}