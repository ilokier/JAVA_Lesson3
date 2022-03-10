import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Company {
    Scanner scan = new Scanner(System.in);
    String name;
    String surname;
    double salary;
    List<Employee> listOfEmployees = new ArrayList<>();

    public Employee createEmployee(Employee employee) {
        try {
            System.out.println("Enter employee name");
            employee.setName(scan.nextLine());
            System.out.println("Enter employee surname");
            employee.setSurname(scan.nextLine());
            System.out.println("Enter employee salary");
            employee.setSalary(scan.nextInt());
            employee.setName(scan.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("You entered wrong values. Please try again");
            scan.nextLine();
            createEmployee(employee);
        }
        return employee;
    }

    public Employee addEmployeesToList(Employee employee) {
        for (int i = 0; i < 2; i++) {
            listOfEmployees.add(createEmployee(new Employee(name, surname, salary)));
        }
        return employee;
    }

    public void sumSalary() {
        int salarySum = 0;
        for (int j = 0; j < listOfEmployees.size(); j++) {
            salarySum += listOfEmployees.get(j).getSalary();
        }
        System.out.println("The sum of salaries for all employees is " + salarySum);
    }

    public void getAllEmployeesData() {
        for (Employee j : listOfEmployees) {
            j.getAllData();
        }
    }
    public void pickMenuOptions() {
        try {
            System.out.println("Pick a menu option: \n" + "1 – Print sum of all employees salary\n" + "\n" + "2 – Display all employees data\n" + "\n" + "3 – Add new employee\n" + "\n" + "4 – End program");
            int numberFromMenu = scan.nextInt();
            scan.nextLine();
            switch (numberFromMenu) {
                case 1:
                    sumSalary();
                    pickMenuOptions();
                    break;
                case 2:
                    getAllEmployeesData();
                    pickMenuOptions();
                    break;
                case 3:
                    listOfEmployees.add(createEmployee(new Employee(name, surname, salary)));
                    pickMenuOptions();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please provide a proper number: 1, 2, 3 or 4. Try again");
                    pickMenuOptions();
            }
        } catch (InputMismatchException e) {
            System.out.println("You can use integers only. Try again");
            scan.nextLine();
            pickMenuOptions();
        }
    }
}