// Demonstrating OOP Concepts in Java
public class OOPS {

    // Main method
    public static void main(String[] args) {

        // ============================
        // 1. Classes and Objects
        // ============================
        PenBasic basicPen = new PenBasic(); // Creating a PenBasic object
        basicPen.setColor("Blue");          // Setting color
        System.out.println("Pen color (basic): " + basicPen.color); // Accessing directly since not private

        basicPen.setTip(5);                 // Setting tip
        System.out.println("Pen tip (basic): " + basicPen.tip);

        basicPen.setColor("Yellow");        // Changing color
        System.out.println("Pen color updated (basic): " + basicPen.color);

        // ============================
        // 2. Access Modifiers
        // ============================
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Luffy";           // public - accessible
        myAcc.setPassword("Zoro");          // private - set using public setter
        // myAcc.password = "Zoro";         // Cannot access private directly

        // ============================
        // 3. Getters and Setters (Encapsulation)
        // ============================
        PenEncapsulated pEnc = new PenEncapsulated(); // Object of encapsulated pen class

        pEnc.setColor("Green");
        System.out.println("Encapsulated Pen color: " + pEnc.getColor());

        pEnc.setTip(7);
        System.out.println("Encapsulated Pen tip: " + pEnc.getTip());

        pEnc.setColor("Red");
        System.out.println("Encapsulated Pen color updated: " + pEnc.getColor());
    }
}

// =========================================
// CLASS 1: Demonstrating Access Modifiers
// =========================================
class BankAccount {
    public String username;       // Public variable: accessible from anywhere
    private String password;      // Private variable: only accessible within class

    // Public setter for the private field 'password'
    public void setPassword(String pwd) {
        password = pwd;
    }
}

// ====================================================
// CLASS 2: Basic Class for Demonstrating Class/Object
// ====================================================
class PenBasic {
    String color;   // default (package-private) access
    int tip;

    // Setter for color
    void setColor(String newColor) {
        color = newColor;
    }

    // Setter for tip
    void setTip(int newTip) {
        tip = newTip;
    }
}

// ===========================================
// CLASS 3: Demonstrates Getters and Setters
// ===========================================
class PenEncapsulated {
    private String color; // private - data hiding
    private int tip;

    // Getter for color
    String getColor() {
        return this.color;
    }

    // Setter for color
    void setColor(String newColor) {
        this.color = newColor;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for tip
    void setTip(int newTip) {
        this.tip = newTip;
    }
}

// ========================================================
// CLASS 4: Demonstrates Class with Method & Data Fields
// ========================================================
class Student {
    String name;
    int age;
    float percentage; // calculated percentage (CGPA approx)

    // Method to calculate percentage
    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3f;
    }
}
