// Optimized Approach for Leftmax

package Array.Prefix_Sum;

public class LeftmaxO {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) { // Array must start from 1 as we have declared arr[0] already
            if (leftmax[i - 1] < arr[i])
                leftmax[i] = arr[i];
            else
                leftmax[i] = leftmax[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(leftmax[i] + " ");
        }
    }
}


//OP: [ -3 6 6 6 6 6 8 8 8 8  ]