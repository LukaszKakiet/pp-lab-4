public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        
        employees[0] = new Employee("John Doe",3000 );
        employees[1] = new Employee("Alice Smith", 60000);
        employees[2] = new Employee("Bob Johnson", 55000);
        employees[3] = new Employee("Emily Davis", 52000);
        employees[4] = new Employee("Michael Wilson", 53000);
        
        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);
        
        employees[3].setSalary(54000);
        System.out.println("Zmodyfikowane dane pracownika o indeksie 3:");
        System.out.println(employees[3]);
        
        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}