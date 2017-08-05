package java7.collections.comparableAndComparator;

public class Car {

    private String vehicleUnqueNumber;

    private String company;

    private String model;

    public String getVehicleUnqueNumber() {
        return vehicleUnqueNumber;
    }

    public void setVehicleUnqueNumber(String vehicleUnqueNumber) {
        this.vehicleUnqueNumber = vehicleUnqueNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return getVehicleUnqueNumber() != null ? getVehicleUnqueNumber().equals(car.getVehicleUnqueNumber()) : car.getVehicleUnqueNumber() == null;
    }

    @Override
    public int hashCode() {
        return getVehicleUnqueNumber() != null ? getVehicleUnqueNumber().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleUnqueNumber='" + vehicleUnqueNumber + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
