// Main class demonstrating constructors: default, parameterized, shallow copy, deep copy
public class OOPS_Constructors {

    public static void main(String[] args) {
        // Creating Student object using parameterized constructor (name)
        Student s1 = new Student("Zoro");
        System.out.println("Student s1 name: " + s1.getName());

        // Creating Student object using default constructor
        Student sDefault = new Student(); // default constructor called
        sDefault.setMarks(new int[]{100, 90, 80});

        // Creating Student object using parameterized constructor (name)
        Student s2 = new Student("Sanji");

        // Creating Student object using parameterized constructor (roll number)
        Student s3 = new Student(123);

        // Shallow copy constructor demonstration
        Student shallowCopy = new Student(sDefault, false);
        shallowCopy.setName("ShallowCopy");
        System.out.println("Shallow copy marks before change:");
        printMarks(shallowCopy);

        // Deep copy constructor
        Student deepCopy = new Student(sDefault, true);
        deepCopy.setName("DeepCopy");
        System.out.println("Deep copy marks before change:");
        printMarks(deepCopy);

        // Modify original object's marks
        int[] marks = sDefault.getMarks();
        marks[0] = 50;
        sDefault.setMarks(marks);

        System.out.println("After modifying original sDefault marks:");
        System.out.print("Original sDefault marks: ");
        printMarks(sDefault);
        System.out.print("Shallow copy marks: ");
        printMarks(shallowCopy);
        System.out.print("Deep copy marks: ");
        printMarks(deepCopy);
    }

    // Helper method to print marks array
    public static void printMarks(Student s) {
        for (int mark : s.getMarks()) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}


// constructors
class Student {
    private String name;
    private int roll;
    private int[] marks;

    // Default constructor
    public Student() {
        marks = new int[3];  // initialize marks array
        System.out.println("Default constructor called");
    }

    // Parameterized constructor (name)
    public Student(String name) {
        this.name = name;
        marks = new int[3]; // initialize marks array
        System.out.println("Parameterized constructor called with name: " + name);
    }

    // Parameterized constructor (roll number)
    public Student(int roll) {
        this.roll = roll;
        marks = new int[3];
        System.out.println("Parameterized constructor called with roll: " + roll);
    }

    // Copy constructor: shallow or deep copy based on flag
    // If isDeepCopy == true, do deep copy; else shallow copy
    public Student(Student s, boolean isDeepCopy) {
        this.name = s.name;
        this.roll = s.roll;
        if (isDeepCopy) {
            // Deep copy: create new array and copy each element
            this.marks = new int[s.marks.length];
            for (int i = 0; i < s.marks.length; i++) {
                this.marks[i] = s.marks[i];
            }
            System.out.println("Deep copy constructor called");
        } else {
            // Shallow copy: assign reference
            this.marks = s.marks;
            System.out.println("Shallow copy constructor called");
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}


// Simple Animal class as provided
class Animal {
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}
