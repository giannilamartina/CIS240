import java.util.ArrayList;
import java.util.Date;

/**Class AccountAbstract creates the abstract account blueprint.
 * Instantiate name, id, balance.
 *
 * @author Gianni LaMartina
 *
 */
public abstract class AccountAbstract {
  private String name = null;
  private int id = 0;
  private double balance = 0;
  
  /**
   * AccountAbstract no-arg constructor.
   */
  public AccountAbstract() {}
  
; //Check style wanted this
   
  /**AccountAbstract constructor taking parameters.
   *
   *@param name = account name
   *@param id = account id
   *@param balance = account balance
   */
  public AccountAbstract(String name, int id, double balance) {
    super();
    this.name = name;
    this.id = id;
    this.balance = balance;
  }
  
  /**
   * Instantiate transactions, annualInterestRate, dateCreated.
   */
  private ArrayList<Transaction> transactions;
  private double annualInterestRate = 0;
  private Date dateCreated = new java.util.Date(); 
  
  /**
   * getName getter.
   *
   * @return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * getId getter.
   *
   * @return id
   */
  public int getId() {
    return id;
  } 
  
  /**
   * getBalance getter.
   *
   * @return balance
   */
  public double getBalance() {
    return balance;
  }
  
  /**
   * setBalance setter.
   *
   * @param balance set
   */
  public void setBalance(double balance) {
    this.balance = balance;
  }

  /**
   * setAnnualInterestRate sets yearly rate.
   *
   * @param newAnnualInterestRate = annualInterestRate
   */
  public void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }
  
  /**
   * getAnnualInterestRate getter.
   *
   * @return annualInterestRate
   */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }
  
  /**
   * getDateCreated getter.
   *
   * @return dateCreated
   */
  public Date getDateCreated() {
    return dateCreated;
  }
  
  /**
   * calculateMonthlyInterestRate abstract method.
   *
   */
  public abstract double calculateMonthlyInterestRate();
  
  /**
   * calculateMonthlyInterest abstract method.
   *
   */
  public abstract double calculateMonthlyInterest();

  /**
   * getTransactions getter. //might be unnecessary?
   *
   * @return transactions
   */
  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }

 
}
