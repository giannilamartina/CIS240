import java.util.ArrayList;
import java.util.Scanner;

/**
 * EmployeeTester tests the Employee superclass and the Contractor/FullTimeEmployee subclasses.
 *
 * @author Gianni LaMartina
 *
 */
public class EmployeeTester {
  /**
   * Prints out type of employee and employee information.
   * While loop filters between type of employee and prompts user to enter info.
   *
   * @param args takes parameters based on subclass used.
   */
  
  public static void main(String[] args) {
    //ArrayList employees
    ArrayList<Employee> employees = new ArrayList<Employee>();
    
    //Import scnr
    Scanner scnr = new Scanner(System.in);
    
    char type;
    char loop = 'Y';
    String firstName;
    String lastName;
    double hourlyWage;
    double hoursWorked;
    
    //While loop selects type and prompts user for input
    while (loop == 'Y') {
      System.out.println("What Type of employee, enter 'C' for Contractor"
          + " or 'F' for Full Time employee?");
      type = scnr.nextLine().charAt(0);
       
      if (type == 'C') {
        System.out.println("Employee's first name? ");
        firstName = scnr.nextLine();
        System.out.println("Employee's last name? ");
        lastName = scnr.nextLine();
        System.out.println("Hourly wage? ");
        hourlyWage = Double.parseDouble(scnr.nextLine());
        System.out.println("Hours worked this week? ");
        hoursWorked = Double.parseDouble(scnr.nextLine());
        
        employees.add(new Contractor(firstName, lastName, hourlyWage, hoursWorked));
      } else if (type == 'F') {
        System.out.println("Employee's first name? ");
        firstName = scnr.nextLine();
        System.out.println("Employee's last name? ");
        lastName = scnr.nextLine();
        System.out.println("Hourly wage? ");
        hourlyWage = Double.parseDouble(scnr.nextLine());
        System.out.println("Hours worked this week? ");
        hoursWorked = Double.parseDouble(scnr.nextLine());
        
        employees.add(new FullTimeEmployee(firstName, lastName, hourlyWage));
      }
      //Continue or exit while loop
      System.out.println("Enter another employee, enter 'Y' for yes? ");
      loop = scnr.nextLine().charAt(0);
    }
    //Enhanced for loop prints employee info and weekly wage.
    for (Employee emp : employees) {
      System.out.println(emp);
      System.out.println("The weekly wage for the employee is $" + emp.calculateWeeklySalary());
    }
    //Close scnr
    scnr.close();
  }
}

