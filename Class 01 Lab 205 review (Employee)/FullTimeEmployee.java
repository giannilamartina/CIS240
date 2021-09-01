/**Subclass FullTimeEmployee extends superclass Employee.
 *
 *@author Gianni LaMartina
 *
 */
public class FullTimeEmployee extends Employee {
  
  /**
   * Constructor FullTimeEmployee builds a FullTimeEmployee object
   * and takes firstName, lastName, and paymentPerHour parameters.
   *
   * @param firstName is the full time employee's first name.
   * @param lastName is the full time employee's last name.
   * @param paymentPerHour is the full time employee's hourly rate.
   */
  public FullTimeEmployee(String firstName, String lastName, double paymentPerHour) {
    super(firstName, lastName, paymentPerHour);
  }
  
  /**
   * calculateWeeklySalary returns the full time employee's weekly salary.
   *
   * @param paymentPerHour is the full time employee's hourly rate.
   * @return weekly salary.
   */
  public double calculateWeeklySalary(double paymentPerHour) {
    return (getPaymentPerHour() * 40);
  }
  
  /**
   * toString prints all of the FullTimeEmployee fields.
   */
  @Override
  public String toString() {
    return "FullTimeEmployee: " + " first name: " + getFirstName() + ", last name: " 
        + getLastName() + ", paymentPerHour $" + getPaymentPerHour();
  }
}
