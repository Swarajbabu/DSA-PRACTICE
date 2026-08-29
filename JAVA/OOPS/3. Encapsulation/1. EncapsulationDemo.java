/*
 * ============================================================================
 * TOPIC: ENCAPSULATION IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Encapsulation is the bundling of data (variables / state) and the methods 
 *      (behavior) that operate on that data into a single unit (class).
 *    - Data Hiding: The internal state of an object is kept private ('private' keyword),
 *      preventing unauthorized external access and direct tampering.
 *    - Controlled Access: External code can only interact with the data through 
 *      well-defined public methods (getters and setters), where validation rules 
 *      can be enforced.
 *
 * 2. DIAGRAM:
 *
 *    +-----------------------------------------------------------------------+
 *    |                              CAPSULE                                  |
 *    |                                                                       |
 *    |   [ DATA HIDING: Private Variables (Inaccessible directly) ]          |
 *    |   - accountNumber : String                                            |
 *    |   - accountHolder : String                                            |
 *    |   - balance       : double                                            |
 *    |                                                                       |
 *    |   [ CONTROLLED ACCESS: Public Methods / Getters & Setters ]           |
 *    |   + getAccountNumber()        : String                                |
 *    |   + getAccountHolder()        : String                                |
 *    |   + setAccountHolder(name)    : void (validates non-empty name)       |
 *    |   + getBalance()              : double                                |
 *    |   + deposit(amount)           : void (validates amount > 0)           |
 *    |   + withdraw(amount)          : void (validates balance sufficiency)  |
 *    +-----------------------------------------------------------------------+
 *
 * 3. KEY BENEFITS:
 *    - Security / Data Protection: Variables cannot be corrupted from outside.
 *    - Flexibility: Internal logic can be changed without breaking external code.
 *    - Read-Only or Write-Only fields: By omitting setters or getters.
 * ============================================================================
 */

class BankAccount {
    // 1. Private variables (Data Hiding - cannot be accessed directly outside this class)
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize the encapsulated data
    BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Setting to 0.0");
            this.balance = 0.0;
        }
    }

    // 2. Public Getters (Read Access)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // 3. Public Setters / Modifiers with validation (Controlled Write Access)
    public void setAccountHolder(String newHolder) {
        if (newHolder != null && !newHolder.trim().isEmpty()) {
            this.accountHolder = newHolder;
        } else {
            System.out.println("Error: Account holder name cannot be empty!");
        }
    }

    // Business Logic with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than 0!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds! Current Balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        }
    }

    public void displayAccountInfo() {
        System.out.println("-----------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-----------------------------------------");
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating a new encapsulated BankAccount object
        BankAccount account = new BankAccount("AC-987654", "Swaraj", 1000.0);

        // Display initial details via public method
        account.displayAccountInfo();

        // Testing controlled deposit
        account.deposit(500.0);

        // Testing controlled withdrawal
        account.withdraw(300.0);

        // Testing validation failure: Attempting to withdraw more than balance
        account.withdraw(2000.0);

        // Updating account holder name using setter
        account.setAccountHolder("Swaraj Babu");

        // Reading balance safely using getter
        System.out.println("Verified Balance via getter: $" + account.getBalance());

        account.displayAccountInfo();

        // NOTE: The following line would cause a COMPILE ERROR because 'balance' is private:
        // account.balance = -10000; // Error: balance has private access in BankAccount
    }
}
