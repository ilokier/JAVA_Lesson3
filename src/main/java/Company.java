import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    Scanner scan = new Scanner(System.in);
    //Employee employee;
    String name;
    String surname;
    int salary;

    public Employee addEmployee(Employee employee) {
        System.out.println("Enter employee name");
        employee.setName(scan.nextLine());
        System.out.println("Enter employee surname");
        employee.setSurname(scan.nextLine());
        System.out.println("Enter employee salary");
        employee.setSalary(scan.nextInt());
        return employee;
    }
    List<Employee> listOfEmployees = new ArrayList<>();
        public Employee addEmployeesToList (Employee employee) {
            for (int i = 0; i < 5; i++) {

                listOfEmployees.add(addEmployee(new Employee(name, surname, salary)));
            }

            for (int j = 0; j < listOfEmployees.size(); j++) {
                System.out.println(listOfEmployees.get(j).getSurname());
            }

return employee;
    }
}
