import java.util.ArrayList;

public class PairSumSortedArray {

    // Brute force approach: O(n^2)
    /*
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true; // Found the pair
                }
            }
        }
        return false; // No such pair found
    }
    */

    // Optimized two-pointer approach: O(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0; // left pointer
        int rp = list.size() - 1; // right pointer

        // Since array is sorted, we can use two pointers
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);

            // Case 1: Pair found
            if (sum == target) {
                return true;
            }

            // Case 2: If sum < target, move left pointer to increase sum
            if (sum < target) {
                lp++;
            } else {
                // Case 3: If sum > target, move right pointer to decrease sum
                rp--;
            }
        }

        // No such pair found
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Sorted ArrayList input
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        // Output result
        System.out.println("Is there a pair with sum " + target + "? " + pairSum1(list, target));
    }
}
