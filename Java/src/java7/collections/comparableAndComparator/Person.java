package java7.collections.comparableAndComparator;

public class Person {

    private String aadharNumber;

    private String name;

    private String address;

    public Person(){}

    public Person(String addharNum,String name,String address){
        this.setAddress(address);
        this.setName(name);
        this.setAadharNumber(addharNum);
    }


    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return getAadharNumber() != null ? getAadharNumber().equals(person.getAadharNumber()) : person.getAadharNumber() == null;
    }

    @Override
    public int hashCode() {
        return getAadharNumber() != null ? getAadharNumber().hashCode() : 0;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
