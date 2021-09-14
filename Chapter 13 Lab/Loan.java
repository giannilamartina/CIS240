package accountinterface;

import java.util.Date;

/**Loan is the subclass of the AccountImpl abstract class and implements the Account interface.
 *
 * @author Gianni LaMartina
 *
 */
public class Loan extends AccountImpl implements Account {

  /**No-arg Loan constructor.
   * 
   */
  public Loan() {}
  
  /**Loan constructor taking id, balance, and name.
   *Logs a new loan transaction in the ArrayList.
   *
   * @param id assigns account id
   * @param balance assigns account balance
   * @param name assigns account name
   */
  public Loan(int id, double balance, String name) {
    super(id, balance, name);
    Transaction transaction = new Transaction(new Date(), 'D', balance, balance, "New Loan");
    getTransactions().add(transaction);
  }
  
  /**Updates balance with passed amount and logs a payment transaction.
   *
   * @param amount is the payment to be reflected on the account balance
   */
  public void payment(double amount) {
    setBalance(getBalance() - amount);
    Transaction transaction = new Transaction(new Date(), 'P', amount, getBalance(), "Payment");
    getTransactions().add(transaction);
  }
    
  /**Overridden balance accessor.
   * 
   */
  @Override
  public double getBalance() {
    return 0;
  }

  /**Overridden monthly interest rate accessor.
   * 
   */
  @Override
  public double getMonthlyInterestRate() {
    return (1 + getAnnualInterestRate() / 365) * 30;
  }

  /**Overridden monthly interest accessor.
   * 
   */
  @Override
  public double getMonthlyInterest() {
    return getAnnualInterestRate() / 12;
  }

  /**Overridden toString that creates a string representing all of the attributes.
   * 
   */
  @Override
  public String toString() {
    return "Loan name: " + getName() + " , id: " + getId() + ", balance: " + getBalance() 
      + ", transactions: " + getTransactions() + ", annualInterestRate: " + getAnnualInterestRate() 
        + ", dateCreated: " + getDateCreated();
  }

}
