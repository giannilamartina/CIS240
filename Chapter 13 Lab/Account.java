package accountinterface;

import java.util.Date;

/**
 * Account interface sets up the methods for implemented classes Loan and Savings.
 *
 * @author Gianni LaMartina
 *
 */
public interface Account {
  
  /**
   * Accessor method for the name attribute.
   *
   * @return Name
   */
  public String getName();

  /**
   * Accessor method for the id attribute.
   *
   * @return Id
   */
  public int getId();

  /**
   * Accessor method for the balance attribute.
   *
   * @return balance
   */
  public double getBalance();

  /**
   * Mutator method for the annualInterestRate attribute.
   *
   * @param rate is the interest rate passed by the user.
   */
  public void setAnnualInterestRate(double rate);

  /**
   * Accessor method for the annualInterestRate attribute.
   *
   * @return annualInterestRate
   */
  public double getAnnualInterestRate();

  /**
   * Accessor method for the dateCreated attribute (Date object).
   *
   * @return dateCreated
   */
  public Date getDateCreated();

  /**
   * Accessor method for the monthly interest rate.
   *
   * @return monthly interest rate (different depending upon transaction type)
   */
  public double getMonthlyInterestRate(); // returns monthly interest rate

  /**
   * Accessor method for the monthly interest accrued.
   *
   * @return monthly interest accrued (different depending upon transaction type)
   */
  public double getMonthlyInterest(); // returns monthly interest

  /**
   * Void method that adds the accrued interest to the balance and logs a transaction.
   */
  public void addInterest();
}
