package java7.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ComparableDemo {

    public static void main(String[] args) {

        Collection<Person> personCollectionFromMaths = PersonFactory.getPersonCollectionData();
        Collection<Person> personCollectionFromScenice = PersonFactory.getPersonCollectionData();
        personCollectionFromScenice.add(new Person("32t2","NewMan","Island"));

        System.out.println("--------------------------------------");

        personCollectionFromMaths.forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("----------------------------------");
        System.out.println("------------ Math subject person data ----------");
        System.out.println(personCollectionFromMaths);
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        System.out.println("------------ Science subject person data ----------");
        System.out.println(personCollectionFromMaths);
        System.out.println("----------------------------------");

        System.out.println("========= only user that contain prasad as  name");
        System.out.println(personCollectionFromMaths.stream().filter(person -> person.getName().contains("prasad")).collect(Collectors.toList()));
        System.out.println("======================");

        System.out.println("----------------------------------");
        System.out.println("------------ Common persons between math and science ----------");
        Collection<Person> common = new ArrayList<>(personCollectionFromMaths);
        common.retainAll(personCollectionFromScenice);
        System.out.println(common);
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        System.out.println("------------ distinct persons between math and science ----------");
        Collection<Person> distinct = new ArrayList<>(personCollectionFromMaths);
        common.removeAll(personCollectionFromScenice);
        System.out.println(distinct);
        System.out.println("----------------------------------");
    }
}
