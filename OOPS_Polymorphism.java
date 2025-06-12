public class OOPS_Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading):
        Calculator calc = new Calculator();
        System.out.println("Sum of 1 and 2 (int): " + calc.sum(1, 2));              // calls sum(int, int)
        System.out.println("Sum of 1.5 and 2.5 (float): " + calc.sum(1.5f, 2.5f));  // calls sum(float, float)
        System.out.println("Sum of 1, 2 and 3 (int): " + calc.sum(1, 2, 3));        // calls sum(int, int, int)

        // Runtime polymorphism (method overriding):
        Animal a = new Animal();
        a.eat(); // prints "eats anything"

        Deer d = new Deer();
        d.eat(); // prints "eats grass" — overridden method is called at runtime

        // Example of inheritance property usage
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println("Dobby has " + dobby.legs + " legs.");
    }
}

// Calculator class demonstrating method overloading (compile-time polymorphism)
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Animal class with eat method
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

// Deer class overriding eat method (runtime polymorphism)
class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("eats grass");
    }
}

// Dog class inheriting from Animal, has an attribute legs
class Dog extends Animal {
    int legs;
}
