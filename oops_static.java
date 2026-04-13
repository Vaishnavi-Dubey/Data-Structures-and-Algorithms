public class OOPS_Static {
    public static void main(String[] args) {
        // Create three Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Set static variable schoolName using one object
        s1.schoolName = "New Gen";

        // Print schoolName using another object (shared across all)
        System.out.println("School Name via s2: " + s2.schoolName); // prints "New Gen"

        // Change static variable schoolName using third object
        s3.schoolName = "ABC";

        // Print schoolName using first object (all refer to the same static variable)
        System.out.println("School Name via s1: " + s1.schoolName); // prints "ABC"
        System.out.println("School Name via s2: " + s2.schoolName); // prints "ABC"
    }
}

class Student {
    // static variable shared by all instances of Student class
    static String schoolName;

    String name;
    int rollNumber;
}
