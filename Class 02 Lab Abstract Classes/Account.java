/**
 * Account class creates an account with id, name, and balance.
 * Implements withdraw and deposit methods.
 *
 * @author Gianni LaMartina
 *
 */
public class Account extends AccountAbstract {
  
  /**
   * No-args constructor for Account.
   */
  public Account() {
    super();
  }
  
  /**
   * Constructor for account taking.
   *
   * @param name = String name
   * @param id = int id
   * @param balance = double balance
   */
  public Account(String name, int id, double balance) {
    super(name, id, balance);
  }
  
  /**
   * calculateMonthlyInterestRate determines monthly rate from annual rate.
   */
  @Override
  public double calculateMonthlyInterestRate() {
    return getAnnualInterestRate() / 12.0;
  }
  
  /**
   * calculateMonthlyInterest determines monthly interest from rate and balance.
   */
  @Override
  public double calculateMonthlyInterest() {
    return (calculateMonthlyInterestRate() / 100) * getBalance();
  }
  
  /**
   * withdraw performs a withdrawal, updates balance, and records a transaction.
   *
   * @param amount = double amount withdrawn
   */
  public void withdraw(double amount) {
    setBalance(getBalance() - amount);
    Transaction withdrawal = new Transaction(getDateCreated(), TransactionType.WITHDRAWAL, 
        amount, getBalance(), "withdrawal");
    System.out.println(withdrawal);
  }
  
  /**
   * deposit performs a deposit, updates balance, and records a transaction.
   *
   * @param amount = double amount deposited
   */
  public void deposit(double amount) {
    setBalance(getBalance() + amount);
    Transaction deposit = new Transaction(getDateCreated(), TransactionType.DEPOSIT, 
        amount, getBalance(), "deposit");
    System.out.println(deposit);
  }
}
