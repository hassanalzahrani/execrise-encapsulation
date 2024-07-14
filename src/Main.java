//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /////////////////////Account class========================


        Account account1 = new Account("sa123", "mohammed fahad", 10000);
        System.out.println(account1);

        account1.credit(500);
        System.out.println(account1);

        account1.debit(200);
        System.out.println(account1);

        Account account2 = new Account("sa1234", "hassan ali", 0);
        account1.transferTo(account2, 300);
        System.out.println(account1);
        System.out.println(account2);


///////////////////////////////employee clas======================


        Employee employee = new Employee("sa321", "sultan alzahrani", 5000);

        // Get and print the employee's information
        System.out.println("Employee ID: " + employee.getID());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());


        employee.raisedSalary(10);
        System.out.println("Raised Salary: " + employee.getSalary());


        System.out.println(employee.toString());
    }


}




