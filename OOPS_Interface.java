// Interface defining moves for chess players
interface ChessPlayer {
    void moves();
}

// Example interfaces for multiple inheritance
interface Herbivore {
    // Herbivore-specific methods could be declared here
}

interface Carnivore {
    // Carnivore-specific methods could be declared here
}

public class OOPS_Interface {
    public static void main(String[] args) {
        // Using ChessPlayer interface implementations
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();

        // Demonstrating multiple inheritance via interfaces
        Bear bear = new Bear();
        System.out.println("Bear implements Herbivore and Carnivore interfaces.");
    }
}

// Implementing ChessPlayer interface: Queen
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen moves: up, down, left, right, diagonal (in all 4 directions)");
    }
}

// Implementing ChessPlayer interface: Rook
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook moves: up, down, left, right");
    }
}

// Implementing ChessPlayer interface: King
class King implements ChessPlayer {
    public void moves() {
        System.out.println("King moves: up, down, left, right, diagonal (1 step only)");
    }
}

// Bear class implements both Herbivore and Carnivore interfaces - multiple inheritance of type
class Bear implements Herbivore, Carnivore {
    // Bear class must implement methods if any are declared in the interfaces
}

// BankAccount class demonstrating encapsulation (getter/setter)
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}

// Pen class with basic attributes and setters/getters
class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

// Student class example (could be expanded)
class Student {
    String name;
    int roll;
    String password;
    int marks[];
}
