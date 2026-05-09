/**
 * Demonstrates Abstraction using Abstract Classes.
 */
abstract class Animal {
    abstract void walk();
    void eat() { System.out.println("Animal eats"); }
}

class Horse extends Animal {
    void walk() { System.out.println("Horse walks on 4 legs"); }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}
