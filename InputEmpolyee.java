import java.util.Scanner;

class InputEmpolyee{
        Scanner scanner = new Scanner(System.in);
        public Employee createEmployee() {
            System.out.println("Enter Employee type (1 for Full-time, 2 for Part-time): ");
            int type = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.println("Enter Employee details:");
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Phone Number: ");
            String phonenumber = scanner.nextLine();

            System.out.print("Enter Employee City: ");
            String city = scanner.nextLine();

            if (type == 1) {
                System.out.print("Enter Monthly Salary: ");
                double monthlySalary = scanner.nextDouble();
                return new FullTimeEmployee(id, name, phonenumber, city, monthlySalary);
            } else {
                System.out.print("Enter Hourly Wage: ");
                double hourlyWage = scanner.nextDouble();
                return new PartTimeEmpolyee(id,name,phonenumber,city,hourlyWage);
            }
        }

        public void printEmployeeDetails(Employee employee) {
            System.out.println("Employee details: " + employee);
        }
    }



