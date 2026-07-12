//Leetcode 42-Hard
package Array.Prefix_Sum;

public class TrappingRainwater {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 2, 0, 6, 9, 3, 2 };
        int n = arr.length;
        int maxelement = Integer.MIN_VALUE;

        // leftmax
        int leftmax[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxelement)
                maxelement = arr[i];

            leftmax[i] = maxelement;
        }

        maxelement = Integer.MIN_VALUE;
        // rightmax
        int rightmax[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxelement)
                maxelement = arr[i];
            rightmax[i] = maxelement;
        }

        // Trapped water logic
        int totalwater = 0;
        for (int i = 0; i < n; i++) {
            if (rightmax[i] > leftmax[i])
                totalwater += leftmax[i] - arr[i];
            else
                totalwater += rightmax[i] - arr[i];
        }
        System.out.println("The Total Water trapped is: " + totalwater);
    }
}
