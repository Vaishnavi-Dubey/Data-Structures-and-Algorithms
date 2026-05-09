//Container with Most Water
//For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
//height = [1,8,6,2,5,4,8,3,7]
import java.util.ArrayList;

public class MaxWaterContainer {

    // Brute Force Approach: O(n^2) Time | O(1) Space
    // This is commented out for reference
    /*
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // Try every pair of lines
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                // Height is minimum of the two lines
                int ht = Math.min(height.get(i), height.get(j));

                // Width is the distance between the lines
                int width = j - i;

                // Area = height × width
                int currWater = ht * width;

                // Store max area found so far
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    */

    // Optimized Two Pointer Approach: O(n) Time | O(1) Space
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // Initialize two pointers: left and right
        int lp = 0; // Left pointer at the beginning
        int rp = height.size() - 1; // Right pointer at the end

        // Move the pointers toward each other
        while (lp < rp) {
            // Height is determined by the shorter of the two lines
            int ht = Math.min(height.get(lp), height.get(rp));

            // Width is the distance between the two lines
            int width = rp - lp;

            // Calculate current area
            int currWater = ht * width;

            // Update maximum if needed
            maxWater = Math.max(maxWater, currWater);

            // Move the pointer pointing to the shorter line
            // Why? Because moving the taller one won't help increase area
            if (height.get(lp) < height.get(rp)) {
                lp++; // Move left pointer forward
            } else {
                rp--; // Move right pointer backward
            }
        }

        return maxWater;
    }

    public static void main(String args[]) {
        // Input: ArrayList of heights (lines on x-axis)
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Heights: " + height);

        // Call the function and print the result
        int maxWater = storeWater(height);
        System.out.println("Maximum Water Container Area: " + maxWater);
    }
}
