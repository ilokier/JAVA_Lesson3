public class Main {
    public static Company company = new Company();
    static String name;
    static String surname;
    static double salary;

    public static void main(String[] args) {
        company.addEmployeesToList(new Employee(name, surname, salary));
        company.pickMenuOptions();
    }
}





