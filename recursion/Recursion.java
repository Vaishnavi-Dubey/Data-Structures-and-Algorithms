public class Recursion {

    // Print numbers from n to 1 (decreasing order)
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Print numbers from 1 to n (increasing order)
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // Find factorial of n
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm = fact(n - 1);
        return n * fnm;
    }

    // Print sum of n natural numbers
    public static int calcSum(int n) {
        if (n == 0) {
            return 0;
        }
        int snm1 = calcSum(n - 1);
        return n + snm1;
    }

    // Calculate nth term in Fibonacci series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        return fnm1 + fnm2;
    }

    // Check if a given array is sorted
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // Find the first occurrence of an element in an array
    public static int firstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, key, i + 1);
    }

    // Find the last occurrence of an element in an array
    public static int lastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int restIndex = lastOccurrence(arr, key, i + 1);
        if (restIndex != -1) {
            return restIndex;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Print decreasing: ");
        printDec(n);
        System.out.println();

        System.out.print("Print increasing: ");
        printInc(n);
        System.out.println();

        System.out.println("Factorial of " + n + " is: " + fact(n));
        System.out.println("Sum of first " + n + " natural numbers: " + calcSum(n));
        System.out.println(n + "th Fibonacci number: " + fib(n));

        int sortedArr[] = {1, 2, 3, 4, 5};
        System.out.println("Is sortedArr sorted? " + isSorted(sortedArr, 0));

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        System.out.println("First occurrence of " + key + ": " + firstOccurrence(arr, key, 0));
        System.out.println("Last occurrence of " + key + ": " + lastOccurrence(arr, key, 0));
    }
}
