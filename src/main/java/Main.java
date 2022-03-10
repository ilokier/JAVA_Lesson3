import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static Company company= new Company();
    static String name;
    static String surname;
    static double salary;

    public static void main(String[] args) {
        company.addEmployeesToList(new Employee(name, surname, salary));
        company.pickMenuOptions();
    }


}





