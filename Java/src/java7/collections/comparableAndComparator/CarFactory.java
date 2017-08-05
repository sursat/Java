package java7.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;

public class CarFactory {

    private final static String[] names={"BMW","Audi-","TATA-","Porshe-","Mercz-","Ferrari-","Honda-","Suzuki-"};

    private final static String[] address = {"hyd-","kakinada-","Atp-","TPG-","AMVT-"};

    public static Collection<Car> getCarCollectionData(){
        Collection<Car> carCollection = new ArrayList<>();
        for(int i=0;i<10;i++){
            Car car = new Car();
            int randomNum = new Random().nextInt();
            randomNum = Math.abs(randomNum);
            car.setVehicleUnqueNumber(UUID.randomUUID().toString());
            car.setCompany(names[randomNum%(names.length)]);
            car.setModel(address[randomNum%(address.length)]);
            carCollection.add(car);
        }
        return carCollection;
    }
}
