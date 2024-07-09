import java.util.ArrayList;
import java.util.List;

public class Employee_Imp implements EmployeeAppear {
    List<Employee> employees = new ArrayList<>();
    InputEmpolyee inputEmployee = new InputEmpolyee();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully : " + employee.toString());
    }

    @Override
    public void viewEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                inputEmployee.printEmployeeDetails(employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    @Override
    public void deleteEmployee(int id) {
        boolean removed = employees.removeIf(employee -> employee.getId() == id);
        if (removed) {
            System.out.println("Employee deleted: ID " + id);
        } else {
            System.out.println("Employee not found: ID " + id);
        }
    }

    @Override
    public void viewAllEmployees() {
        for (Employee employee : employees) {
            inputEmployee.printEmployeeDetails(employee);
        }
    }


}

