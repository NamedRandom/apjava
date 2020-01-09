// SUBCLASS Savings INHERITS BankAccount CLASS
public class Savings extends BankAccount {
  // DATA MEMBERS
  private double interestRate = 0.0; // ANNUAL INTEREST RATE

  // METHOD MEMBERS

  // PARAMETERLESS CONSTRUCTOR
  public Savings() {
    super(0000, "", 0.0);
  } // END Savings()

  // CONSTRUCTOR TO INITIALIZE ACCOUNT NUMBER AND BALANCE
  public Savings(int acctNum, String name, double bal) {
    super(acctNum, name, bal);
  } // END Savings(int,String, double)

  // CONSTRUCTOR TO INITIALIZE ALL PRIVATE DATA
  public Savings(int acctNum, String name, double bal, double rate) {
    super(acctNum, name, bal);
    interestRate = rate;
  } // END Savings(int,double,double)

  // withdraw() METHOD
  public void withdraw(double amt) {
    changeBalance(amt);
  } // END withdraw()

  // IMPLEMENTATION FOR addInterest() METHOD
  public void addInterest() {
    double interest;
    interest = getBalance() * (interestRate / 12 / 100);
    changeBalance(interest);
  } // END addInterest()
} // END Savings CLASS
