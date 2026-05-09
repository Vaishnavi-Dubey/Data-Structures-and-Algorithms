/**
 * Binary Search Implementation.
 * Time Complexity: O(log n).
 * Space Complexity: O(1) - Iterative, O(log n) - Recursive (stack).
 */
public class BinarySearch {
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] data = {2, 3, 4, 10, 40};
        int res = search(data, 10);
        System.out.println(res != -1 ? "Found at: " + res : "Not found");
    }
}
