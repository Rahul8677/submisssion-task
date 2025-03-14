
    import java.util.ArrayList;
import java.util.List;

    class Employee {
        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
        }
    }

    public class EmployeeManagementSystem {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee(101, "Rahul Khedkar", 50000));
            employees.add(new Employee(102, "Amit Sharma", 60000));
            employees.add(new Employee(103, "Priya Verma", 55000));

            System.out.println("Employee Details:");
            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }
    }


