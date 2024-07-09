public class Employee {
    int id;
    String name;
    String phonenumber;
    String city;

    public Employee(int id, String name, String phonenumber, String city) {
        this.id = id;
        this.name = name;
        this.phonenumber =phonenumber;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return phonenumber;
    }
    public void setNumber(int number) {
        this.phonenumber =phonenumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Empolyee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + phonenumber +
                ", city='" + city + '\'' +
                '}';
    }
}
