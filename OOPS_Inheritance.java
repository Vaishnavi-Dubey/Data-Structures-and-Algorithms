public class OOPS_Inheritance {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Dog d = new Dog();
        d.legs = 4;          // inherited from Mammal
        d.breed = "Beagle";  // specific to Dog
        d.walk();            // inherited method from Mammal

        Fish f = new Fish();
        f.swim();            // Fish specific method
        f.eat();             // inherited from Animal

        Bird b = new Bird();
        b.fly();             // Bird specific method
        b.eat();             // inherited from Animal
    }
}

// Base class - Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Mammal inherits from Animal (IS-A relationship)
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Mammal walks");
    }
}

// Dog inherits from Mammal (Dog IS-A Mammal)
class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println("Dog barks");
    }
}

// Fish inherits from Animal
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

// Bird inherits from Animal
class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}
