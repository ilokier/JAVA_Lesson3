import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {
    static Scanner scan = new Scanner(System.in);

    public static Employee getEmployeeFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scan.nextLine();
        System.out.println("Enter employee surname");
        String surname = scan.nextLine();
        System.out.println("Enter employee salary");
        int salary = scan.nextInt();
        return new Employee(name, surname, salary);
    }

    public static int getIntFromUser() {
        try {
            System.out.println("Pick a menu option: \n" + "1 – Print sum of all employees salary\n" + "\n" + "2 – Display all employees data\n" + "\n" + "3 – Add new employee\n" + "\n" + "4 – End program");
            return scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("You can use integers only. Try again");
            return getIntFromUser();
        }
    }
}