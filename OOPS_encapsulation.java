public class OOPS_encapsulation {

    public static void main(String[] args) {
        // Creating an object of the class Account
        Account myAccount = new Account();

        // Setting values using setter methods
        myAccount.setUsername("Luffy");
        myAccount.setPassword("StrawHat123");
        myAccount.setBalance(5000);

        // Getting values using getter methods
        System.out.println("Username: " + myAccount.getUsername());
        System.out.println("Balance: $" + myAccount.getBalance());

        // Trying to access private fields directly will cause compile-time errors
        // myAccount.password = "newpassword"; // Not allowed!

        // Changing password using setter method
        myAccount.setPassword("NewPassword456");
        System.out.println("Password updated successfully.");
    }
}

// Account class demonstrates encapsulation by keeping data members private
// and providing public getter and setter methods to access and modify them
class Account {
    // Private data members - cannot be accessed directly outside this class
    private String username;
    private String password;
    private double balance;

    // Getter method for username
    public String getUsername() {
        return username;
    }

    // Setter method for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method for password (usually you wouldn't expose password like this, but for demo)
    public String getPassword() {
        return password;
    }

    // Setter method for password (with validation example)
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance with simple validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
