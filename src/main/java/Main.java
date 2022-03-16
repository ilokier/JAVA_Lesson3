public class Main {
    public static Company company = new Company();

    public static void main(String[] args) {

        addEmployeesToList(company);
        pickMenuOptions(company);
    }

    public static void addEmployeesToList(Company company) {
        for (int i = 0; i < 2; i++) {
            company.addNewEmployee(UserMenu.getEmployeeFromUser());
        }
    }

    public static void pickMenuOptions(Company company) {

        while (true) {
            int selectedOption = UserMenu.getIntFromUser();
            switch (selectedOption) {
                case 1:
                    company.sumEmployeesSalary();
                    break;
                case 2:
                    company.getAllEmployeesData();
                    break;
                case 3:
                    company.addNewEmployee(UserMenu.getEmployeeFromUser());
                    break;
                case 4:
                    System.out.println("End of program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please provide a proper number: 1, 2, 3 or 4. Try again");

            }
        }

    }
}


