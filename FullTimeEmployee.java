public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id, String name, String phonenumber, String city, double monthlysalary) {
        super(id, name, phonenumber, city);
        Monthlysalary = monthlysalary;
    }

    double Monthlysalary;

    public double getMonthlysalary() {
        return Monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        Monthlysalary = monthlysalary;
    }

    public FullTimeEmployee(int id, String name, String phonenumber, String city) {
        super(id, name, phonenumber, city);


    }


}
