/**Subclass Contractor extends superclass Employee.
 *
 *@author Gianni LaMartina
 *
 */

public class Contractor extends Employee {
  private double workingHours;
    
  /**
   * Contractor constructor builds a Contractor object and takes firstName,
   * lastName, workingHours, and paymentPerHour parameters.
   *
   * @param firstName is the contractor's first name.
   * @param lastName is the contractor's last name.
   * @param workingHours is the contractor's number of hours worked.
   * @param paymentPerHour is the contractor's hourly rate.
   */
  
  public Contractor(String firstName, String lastName, double workingHours, double paymentPerHour) {
    super(firstName, lastName, paymentPerHour);
    this.workingHours = workingHours;
  }

  /** 
   *Getters and setters for firstName, lastName, workingHours, and paymentPerHour.
   *
   *@return firstName, lastName, , workingHours, and paymentPerHour.
   */
  public double getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(double workingHours) {
    this.workingHours = workingHours;
  }
  
  /**
   * calculateWeeklySalary calculates and returns the employee's weekly salary.
   *
   * @return weekly salary.
   * 
   */
  public double calculateWeeklySalary() {
    return (getPaymentPerHour() * workingHours);
  }
  
  /**
   * toString prints all of the contractor fields.
   */
  @Override
  public String toString() {
    return "Contractor: first name: " + getFirstName() + ", last name: " + getLastName() 
      + ", paymentPerHour: $" + getPaymentPerHour() + ", workingHours: " + getWorkingHours() + " ";
  }
  
}
