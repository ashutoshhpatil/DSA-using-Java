// Bubble Sort using Recursion

package Sorting;

public class RecursiveBubbleSort {
    int count = 0;

    void bubblesort(int arr[], int n) {
        if (n == 1)
            return;

        boolean swapped;

        swapped = false;
        for (int j = 0; j < n - 1; j++) {
            count++;
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (swapped == false)
            return;

        bubblesort(arr, n - 1);
    }

    public static void main(String[] args) {
        // int arr[] = new int[] { 7, 3, 9, 4, 2, 5, 6 };
        int arr[] = new int[] { 2, 3, 4, 5, 6, 9, 7 };
        RecursiveBubbleSort obj = new RecursiveBubbleSort();
        obj.bubblesort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(obj.count);
    }
}
