public class BankAccount {
  private double balance;
  private boolean isFrozen;

  public BankAccount() {
    this.balance = 0.0;
    this.isFrozen = false;
  }

  public void deposit(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }

    System.out.printf("Amount deposited: %.2f%n", amount);
    if (!isValidAmount(amount)) {
      System.out.println("Invalid amount. Must be greater than 0");
      return;
    }

    balance += amount;
    System.out.printf("Current balance: %.2f%n", balance);
  }

  public void withdraw(double amount) {
    if (isFrozen) {
      System.out.println("Account is FROZEN. Unable to transact.");
      return;
    }

    System.out.printf("Amount withdrawn: %.2f%n", amount);
    if (!isValidAmount(amount)) {
      System.out.println("Invalid amount. Must be greater than 0");
      return;
    }

    if (amount > balance) {
      System.out.printf("Insufficient balance. Current balance: %.2f%n", balance);
      return;
    }

    balance -= amount;
    System.out.printf("Current balance: %.2f%n", balance);
  }

  public double getBalance() {
    return balance;
  }

  public void freezeAccount() {
    this.isFrozen = true;
  }

  public void unfreezeAccount() {
    this.isFrozen = false;
  }

  public boolean isFrozen() {
    return isFrozen;
  }

  private boolean isValidAmount(double amount) {
    return Double.isFinite(amount) && amount > 0;
  }
}
