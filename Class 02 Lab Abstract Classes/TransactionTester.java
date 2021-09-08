/**
 * Tests the Account and Transaction classes.
 *
 * @author Gianni LaMartina
 *
 */
public class TransactionTester {

  /**
   * Adds Account account, prints balance, monthly interest, transactions, and
   * creation date.
   *
   */
  public static void main(String[] args) {
    Account account = new Account("Savings", 1122, 20000);
    account.setAnnualInterestRate(4.5);
    
    System.out.println("The Balance: $" + account.getBalance());
    System.out.println("The Monthly interest: " + account.calculateMonthlyInterestRate() + "%");
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("The Account Create Date: " + account.getDateCreated());
  }

}
