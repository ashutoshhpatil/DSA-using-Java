package Array.Prefix_Sum;

public class LeftMax {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int n = arr.length;
        int leftmax[] = new int[n];
        int maxelement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxelement) {
                maxelement = arr[i];
            }
            leftmax[i] = maxelement;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(leftmax[i] + " ");
        }

    }
}

// OP: [ -3 6 6 6 6 6 8 8 8 8 ]