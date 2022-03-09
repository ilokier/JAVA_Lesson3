import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Company company = new Company();
   //static Employee employee1;
    static Menu menu;

    static String name;
    static String surname;
    static int salary;

    public static void main(String[] args) {
      //  company.addEmployee(new Employee (name, surname, salary));

        company.addEmployeesToList(new Employee(name, surname, salary));
        //menu.pickMenuOptions();
    }


}





