package java7.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;

public class PersonFactory {

    private final static String[] names={"prasad-","amar-","k-","JP-","Mer-","Komal-","user-name-","sag-"};

    private final static String[] address = {"hyd-","kakinada-","Atp-","TPG-","AMVT-"};

    public static Collection<Person> getPersonCollectionData(){
        Collection<Person>  personCollection = new ArrayList<>();
        for(int i=0;i<10;i++){
            Person person = new Person();
            int randomNum = new Random().nextInt();
            randomNum = Math.abs(randomNum);
            person.setAadharNumber(UUID.randomUUID().toString());
            person.setName(names[randomNum%names.length]);
            person.setAddress(address[randomNum%address.length]);
            personCollection.add(person);
        }
        return personCollection;
    }
}
