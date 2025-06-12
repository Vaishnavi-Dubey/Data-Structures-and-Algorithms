// Main class to demonstrate OOP concepts with abstraction
public class OOPS_Abstraction {

    public static void main(String[] args) {
        // ==============================
        // Demonstrating Abstraction and Inheritance
        // ==============================

        Horse horseObj = new Horse();    // Object of Horse class
        horseObj.eat();                  // Inherited method from Animal
        horseObj.walk();                 // Overridden method

        Chicken chickenObj = new Chicken(); // Object of Chicken class
        chickenObj.eat();
        chickenObj.walk();

        // ==============================
        // Demonstrating Constructor Chaining
        // ==============================
        Mustang myHorse = new Mustang();  // Mustang extends Horse
    }
}

// ===================================================
// ABSTRACT CLASS: Demonstrates Abstraction
// ===================================================
abstract class Animal {
    String color;

    // Constructor
    Animal() {
        color = "Blue";
        System.out.println("Animal constructor called. Default color: " + color);
    }

    // Concrete method
    void eat() {
        System.out.println("Animal eats");
    }

    // Abstract method to be implemented by subclasses
    abstract void walk();
}

// ===================================================
// SUBCLASS 1: Inherits Animal - Demonstrates Overriding
// ===================================================
class Horse extends Animal {

    Horse() {
        super(); // Calls Animal constructor
        this.color = "Orange";
        System.out.println("Horse constructor called. Color set to: " + color);
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    void changeColor() {
        this.color = "Purple"; // Accessing inherited field
        System.out.println("Horse color changed to: " + this.color);
    }
}

// ===================================================
// SUBCLASS 2: Another implementation of Animal
// ===================================================
class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

// ===================================================
// SUBCLASS OF HORSE: Demonstrates Multi-level Inheritance
// ===================================================
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

// ===================================================
// CLASS: Demonstrates Static Members, Getters and Setters
// ===================================================
class Student {
    static String schoolName; // shared by all objects
    String name;
    int roll;

    // Method to calculate percentage
    int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    // Getter
    String getName() {
        return this.name;
    }

    // Setter
    void setName(String name) {
        this.name = name;
    }
}
