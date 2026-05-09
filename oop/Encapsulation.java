/**
 * Demonstrates Encapsulation using private fields and getters/setters.
 */
class Student {
    private String name;
    private int roll;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll() { return roll; }
    public void setRoll(int roll) { this.roll = roll; }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vaishnavi");
        s.setRoll(1);
        System.out.println("Name: " + s.getName() + ", Roll: " + s.getRoll());
    }
}
