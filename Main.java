import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee_Imp manager = new Employee_Imp();
        InputEmpolyee inputEmployee = new InputEmpolyee();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Employee newEmployee = inputEmployee.createEmployee();
                    manager.addEmployee(newEmployee);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to view: ");
                    int viewId = scanner.nextInt();
                    manager.viewEmployee(viewId);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;
                case 4:
                    manager.viewAllEmployees();
                    break;
                case 5:
                    System.out.println("Thank you ");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
