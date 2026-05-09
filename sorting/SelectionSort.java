/**
 * Selection Sort Implementation.
 * Time Complexity: O(n^2) - Best, Average, and Worst cases.
 * Space Complexity: O(1) - In-place sorting.
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        sort(data);
        for(int i : data) System.out.print(i + " ");
    }
}
