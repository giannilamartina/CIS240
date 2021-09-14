package accountinterface;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * AccountImpl sets up the methods for extended classes Loan and Savings.
 *
 * @author Gianni LaMartina
 *
 */
public abstract class AccountImpl {
  private String name = "";
  private int id = 0;
  private double balance = 0;
  private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
  private double annualInterestRate = 0;
  private Date dateCreated;

  /**
   * AccountImpl no-arg constructor sets date to August 13, 2018.
   */
  public AccountImpl() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2018, 7, 13); // zero-indexed month
    this.dateCreated = calendar.getTime();
  }

  /**
   * AccountImpl constructor passes id, balance, and name. Sets date to August 13,
   * 2018.
   *
   * @param id      is the account ID
   * @param balance is the initial balance
   * @param name    is the name of the account
   */
  public AccountImpl(int id, double balance, String name) {
    super();
    this.id = id;
    this.balance = balance;
    this.name = name;
    Calendar calendar = Calendar.getInstance();
    calendar.set(2018, 7, 13); // zero-indexed month
    this.dateCreated = calendar.getTime();
  }

  /**
   * Accessor method for the balance attribute.
   *
   * @return balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Mutator method for the balance attribute.
   *
   * @param balance sets balance
   */
  public void setBalance(double balance) {
    this.balance = balance;
  }

  /**
   * Accessor method for the name attribute.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Mutator for the name attribute.
   *
   * @param name sets name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Accessor method for the id attribute.
   *
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * Mutator method for the id attribute.
   *
   * @param id sets id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Accessor for the annualInterestRate attribute.
   *
   * @return annualInterestRate
   */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /**
   * Mutator for the annualInterestRate attribute.
   *
   * @param annualInterestRate sets annualInterestRate
   */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /**
   * Accessor for the ArrayList transactions list.
   *
   * @return transactions
   */
  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }

  /**
   * Accessor method for Date object dateCreated.
   *
   * @return dateCreated
   */
  public Date getDateCreated() {
    return dateCreated;
  }

  /**
   * Abstract accessor method for monthly interest rate.
   * 
   */
  public abstract double getMonthlyInterestRate();

  /**
   * Abstract accessor method for monthly interest.
   *
   */
  public abstract double getMonthlyInterest();

  /**
   * Void method that adds monthly interest to the balance and logs a transaction.
   * 
   */
  public void addInterest() {
    balance += getMonthlyInterest();
    Transaction transaction = new Transaction(new Date(), 'D', getMonthlyInterest(), 
        balance, "Monthly Interest");
    getTransactions().add(transaction);
  }

  /**
   * toString method that creates a string representing all of the attributes.
   * 
   */
  @Override
  public String toString() {
    return "AccountImpl [name=" + name + ", id=" + id + ", balance=" + balance + ","
        + " transactions=" + transactions + ", annualInterestRate=" 
        + annualInterestRate + "," + " dateCreated=" + dateCreated + "]";
  }

}
