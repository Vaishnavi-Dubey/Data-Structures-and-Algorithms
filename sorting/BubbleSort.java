/**
 * Bubble Sort Implementation.
 * Time Complexity: O(n^2) - Worst and Average cases, O(n) - Best case (optimized).
 * Space Complexity: O(1) - In-place sorting.
 */
public class BubbleSort {

    /**
     * Sorts the array using the Bubble Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        printArray(data);

        sort(data);

        System.out.println("Sorted Array (Bubble Sort):");
        printArray(data);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
