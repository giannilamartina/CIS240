/**Super class named Employee.
 *
 *@author Gianni LaMartina
 * 
 */
public class Employee {
  
  private String firstName;
  private String lastName;
  private double paymentPerHour;
  
  
  /**
   * Employee builds an employee object and takes firstName, lastName, and paymentPerHour.
   *
   * @param firstName is the employee's first name.
   * @param lastName is the employee's last name.
   * @param paymentPerHour is the employee's hourly rate.
   */
  public Employee(String firstName, String lastName, double paymentPerHour) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.paymentPerHour = paymentPerHour;
  }

  /** 
   *Getters and setters for firstName, lastName, and paymentPerHour.
   *
   *@return firstName, lastName, paymentPerHour
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getPaymentPerHour() {
    return paymentPerHour;
  }

  public void setPaymentPerHour(double paymentPerHour) {
    this.paymentPerHour = paymentPerHour;
  }
  
  /**
   * calculateWeeklySalary calculates and returns the employee's weekly salary.
   *
   * @return weeklySalary.
   * 
   */
  public double calculateWeeklySalary() {
    double weeklySalary = paymentPerHour * 40;
    return weeklySalary;
  }
  
  
  /**
   * toString prints all of the employee fields.
   */
  @Override
  public String toString() {
    return "First name: " + firstName + "," +  " Last name: " 
        + lastName + "," + " paymentPerHour: " + paymentPerHour + ",";
  }
}
