// OPTIMIZED APPROACH 
package Array.ArrayBasics;

class arrDemo1_1 {
    public static void main(String[] args) {

        int n = 10;
        int arr[] = { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };

        // Step 1: Find max element
        int maxElement = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Step 2: Count occurrences of max element
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxElement) {
                maxCount++;
            }
        }

        // Step 3: Elements having at least one element greater
        int result = n - maxCount;

        System.out.println(result);
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)