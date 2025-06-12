public class OOPS_gettersSetters {

    public static void main(String[] args) {
        // Creating an object of Pen class
        Pen p1 = new Pen();

        // Using setter methods to set values (Encapsulation: data hiding + controlled access)
        p1.setColor("Blue");
        p1.setTip(5);

        // Using getter methods to retrieve values
        System.out.println("Pen color: " + p1.getColor());
        System.out.println("Pen tip size: " + p1.getTip());

        // Changing color using setter
        p1.setColor("Yellow");
        System.out.println("Updated pen color: " + p1.getColor());

        // Creating an object of BankAccount class
        BankAccount myAcc = new BankAccount();

        // Directly accessing public member (not recommended for security reasons)
        myAcc.username = "Monkey.D.Luffy";

        // Setting password using setter (password is private)
        myAcc.setPassword("onepiece");

        // Accessing username directly
        System.out.println("Username: " + myAcc.username);

        // Getting password via getter (usually you wouldn't print passwords, here just for demo)
        System.out.println("Password: " + myAcc.getPassword());
    }
}

// Pen class demonstrating encapsulation via private fields and public getters/setters
class Pen {
    // private fields (hidden from outside access)
    private String color;
    private int tip;

    // getter for color
    public String getColor() {
        return this.color;
    }

    // setter for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // getter for tip
    public int getTip() {
        return this.tip;
    }

    // setter for tip
    public void setTip(int newTip) {
        this.tip = newTip;
    }
}

// BankAccount class demonstrating access modifiers (public and private) and encapsulation
class BankAccount {
    // public field - can be accessed directly (but not recommended for sensitive info)
    public String username;

    // private field - accessible only inside this class
    private String password;

    // getter method for password
    public String getPassword() {
        return this.password;
    }

    // setter method for password (controls access and can have validation)
    public void setPassword(String pwd) {
        // example validation can be added here
        this.password = pwd;
    }
}
