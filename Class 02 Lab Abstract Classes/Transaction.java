import java.util.Date;

/**
 * Transaction creates a transaction with Date, TransactionType, amount, balance, and description.
 *
 * @author Gianni LaMartina
 *
 */
public class Transaction {
  private Date transactionDate;
  private TransactionType type;
  private double amount = 0;
  private double balance = 0;
  private String description = null;
  
  /**
   * Constructor creates a Transaction.
   *
   * @param transactionDate the date the transaction occurred
   * @param type the type of transaction
   * @param amount the amount of the transaction
   * @param balance the current balance before the transaction
   * @param description of the transaction
   */
  public Transaction(Date transactionDate, TransactionType type, 
      double amount, double balance, String description) {
    super();
    this.transactionDate = transactionDate;
    this.type = type;
    this.amount = amount;
    this.balance = balance;
    this.description = description;
  }

  /**
   * prints the fields from Transaction.
   */
  @Override
  public String toString() {
    return "Transaction [transactionDate=" + transactionDate
        + ", type=" + type + ", amount=$" + amount + ", balance=$"
        + balance + ", description=" + description + "]";
  }
  
    
  
  
  
  
}
