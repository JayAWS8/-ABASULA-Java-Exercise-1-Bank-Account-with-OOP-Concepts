/**
 * Demonstrates deposits, withdrawals, and freeze controls on a savings account.
 */
public class Main {
  /**
   * Runs the bank account demonstration with valid and invalid transactions.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    BankAccount acc1 = new SavingsAccount("Test0");
    System.out.println(
        "Account Owner: " + ((SavingsAccount) acc1).getOwnerName());

    acc1.deposit(1000.125);
    acc1.deposit(0);
    acc1.deposit(-500);

    acc1.withdraw(500);
    acc1.withdraw(1500);
    acc1.withdraw(-100);

    acc1.freezeAccount();
    acc1.deposit(11500);
    acc1.withdraw(500);

    acc1.unfreezeAccount();
    acc1.withdraw(100);
  }
}