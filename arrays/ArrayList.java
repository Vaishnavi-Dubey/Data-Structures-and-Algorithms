import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.Collections;

public class Classroom {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Declaring and initializing ArrayLists for Integer, String, and Boolean
        ArrayList<Integer> integerList = new ArrayList<>(); // ArrayList to store Integer elements
        ArrayList<String> stringList = new ArrayList<>();   // ArrayList to store String elements (not used in this example)
        ArrayList<Boolean> booleanList = new ArrayList<>(); // ArrayList to store Boolean elements (not used in this example)

        // Adding elements
        integerList.add(2);
        integerList.add(5);
        integerList.add(9);
        integerList.add(6);
        integerList.add(8);

        // Inserting at a specific index
        integerList.add(1, 9);

        // Printing the current state
        System.out.println("Added elements in the ArrayList: " + integerList);

        // Accessing an element
        int element = integerList.get(2);
        System.out.println("Element at index 2 is: " + element);

        // Removing an element
        integerList.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + integerList);

        // Updating an element
        integerList.set(2, 10);
        System.out.println("ArrayList after updating index 2 to 10: " + integerList);

        // Contains
        System.out.println("Does the list contain 1? " + integerList.contains(1));
        System.out.println("Does the list contain 9? " + integerList.contains(9));

        // Size
        System.out.println("Size of the ArrayList: " + integerList.size());

        // Iterating through the ArrayList
        System.out.println("Elements in the ArrayList are:");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();

        // Reverse printing
        System.out.print("Reverse of the ArrayList is: ");
        for (int i = integerList.size() - 1; i >= 0; i--) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();

        // Finding max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > max) {
                max = integerList.get(i);
            }
        }
        System.out.println("Maximum element in the ArrayList is: " + max);

        // Swapping elements
        int idx1 = 1, idx2 = 3;
        System.out.println("ArrayList before swapping: " + integerList);
        swap(integerList, idx1, idx2);
        System.out.println("ArrayList after swapping elements at indices " + idx1 + " and " + idx2 + ": " + integerList);

        // Sorting ascending
        System.out.println("ArrayList before sorting: " + integerList);
        Collections.sort(integerList);
        System.out.println("ArrayList after sorting in ascending order: " + integerList);

        // Sorting descending
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println("ArrayList after sorting in descending order: " + integerList);

        // Multi-dimensional ArrayList (manual approach)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        mainList.add(innerList1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(4);
        mainList.add(innerList2);

        System.out.println("Manual Multi-dimensional ArrayList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("Multi-dimensional ArrayList (manual): " + mainList);

        // Multi-dimensional ArrayList (loop-based)
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println("Multi-dimensional ArrayList (loop-based): " + mainList);

        // Nested loops to print
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
