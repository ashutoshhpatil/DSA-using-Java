// Binary Search 

import java.util.*;

public class BinarySearch {

    int bsearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key)
                end = mid - 1;

            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        BinarySearch obj = new BinarySearch();
        int index = obj.bsearch(arr, key);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index);

        sc.close();
    }
}
