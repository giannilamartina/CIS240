package accountinterface;

import java.util.Date;

/**Savings is the subclass of AccountImpl and implements the Account interface.
 *
 * @author Gianni LaMartina
 *
 */
public class Savings extends AccountImpl implements Account {

  /**No-arg Savings constructor.
   *
   */
  public Savings() {}
  
  /**Savings constructor taking id, balance, and name.
   *
   * @param id assigns account id
   * @param balance assigns account balance
   * @param name assigns account name
   */
  public Savings(int id, double balance, String name) {
    super(id, balance, name);
    Transaction transaction = new Transaction(new Date(), 'D', balance, balance, "New Savings");
    getTransactions().add(transaction);
  }
  
  /**Updates balance removing passed amount and logs a withdrawal transaction.
   *
   * @param amount is the withdrawal to be reflected on the account balance
   */
  public void withdraw(double amount) {
    setBalance(getBalance() - amount);
    Transaction transaction = new Transaction(new Date(), 'W', amount, getBalance(), "Withdrawal");
    getTransactions().add(transaction);
  }
  
  /**Updates balance adding passed amount and logs a deposit transaction.
   *
   * @param amount is the deposit to be reflected on the account balance
   */
  public void deposit(double amount) {
    setBalance(getBalance() + amount);
    Transaction transaction = new Transaction(new Date(), 'D', amount, getBalance(), "Deposit");
    getTransactions().add(transaction);
  }
  
  /**Overridden monthly interest rate accessor.
   *
   */
  @Override
  public double getMonthlyInterestRate() {
    return getAnnualInterestRate() / 12;
  }

  /**Overridden monthly interest accessor.
   * 
   */
  @Override
  public double getMonthlyInterest() {
    return getBalance() * getMonthlyInterestRate();
  }

  /**Overridden toString that creates a string representing all of the attributes.
   *
   */
  @Override
  public String toString() {
    return "Savings: name: " + getName() + ", id: " + getId() + ", balance: " + getBalance() 
       + ", transactions: " + getTransactions() + ", annualInterestRate: " 
        + getAnnualInterestRate() + ", dateCreated: " + getDateCreated();
  }

}
