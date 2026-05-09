/**
 * Demonstrates Inheritance (Base and Derived classes).
 */
class Fish {
    void breathe() { System.out.println("Breathes in water"); }
}

class Shark extends Fish {
    void hunt() { System.out.println("Hunts in ocean"); }
}

public class Inheritance {
    public static void main(String[] args) {
        Shark s = new Shark();
        s.breathe();
        s.hunt();
    }
}
