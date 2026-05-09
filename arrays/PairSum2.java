import java.util.ArrayList;

public class PairSum2 {

    // Check if any pair in a sorted & rotated array adds up to the target
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // 1. Find the pivot point where array is rotated
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // 2. Set two pointers
        int lp = (pivot + 1) % n; // smallest element index
        int rp = pivot;           // largest element index

        // 3. Two-pointer logic in circular manner
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            // Case 1: Target found
            if (sum == target) {
                return true;
            }

            // Case 2: Sum too small → move left pointer forward
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                // Case 3: Sum too large → move right pointer backward
                rp = (n + rp - 1) % n;
            }
        }

        return false; // No such pair found
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Rotated sorted array: 11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println("Pair with sum " + target + " exists: " + pairSum2(list, target));
    }
}
