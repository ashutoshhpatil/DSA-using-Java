// Quick Sort
package Sorting;

public class QuickSort {

    // Logic of Quick Sort
    int Partition(int arr[], int start, int end) {
        int Pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= Pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    // Recursive function logic
    void quicksort(int arr[], int start, int end) {
        if (start < end) {
            int Pivot = Partition(arr, start, end);

            quicksort(arr, start, Pivot - 1);
            quicksort(arr, Pivot + 1, end);
        }

    }

    // Main function
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 1, 5, 9, 11, 8, 3, 5 };
        int start = 0;
        int end = arr.length - 1;
        QuickSort obj = new QuickSort();
        obj.quicksort(arr, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
