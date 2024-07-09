public class PartTimeEmpolyee extends Employee{
    double hourlyWage;

    public PartTimeEmpolyee(int id, String name, String phonenumber, String city, double hourlyWage) {
        super(id, name, phonenumber, city);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", phonenumber='" + getNumber() + '\'' +
                ", city='" + getCity() + '\'' +
                ", hourlyWage=" + hourlyWage +
                '}';
    }
}
