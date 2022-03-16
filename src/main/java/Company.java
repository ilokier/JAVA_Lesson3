import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees = new ArrayList<>();

    public void sumEmployeesSalary() {
        int salarySum = 0;
        for (int j = 0; j < employees.size(); j++) {
            salarySum += employees.get(j).getSalary();
        }
        System.out.println("The sum of salaries for all employees is " + salarySum);
    }

    public void getAllEmployeesData() {
        for (Employee j : employees) {
            System.out.println(j.toString());
        }
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

}
