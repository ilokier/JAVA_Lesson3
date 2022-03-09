import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public int pickMenuOptions() {
        System.out.println("Pick a number\n" + "1 – Print sum of all employees salary\n" +
                "\n" +
                "2 – Display all employees data\n" +
                "\n" +
                "3 – Add new employee\n" +
                "\n" +
                "4 – End program");
        try {
            int numberFromMenu = scanner.nextInt();
            switch (numberFromMenu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please provide a proper number: 1, 2, 3 or 4. Try again");
                    pickMenuOptions();
            }
        } catch (InputMismatchException e) {
            System.out.println("You can use integers only. Try again");
            pickMenuOptions();
        }

        return 0;
    }
}
