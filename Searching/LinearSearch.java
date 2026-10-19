// Linear Search

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        // Array Declaration
        System.out.println("Enter elements :");
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        // Linear Search Logic
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);

                flag = -1;
                break;
            }

        }

        if (flag == 0) {
            System.out.println("Element not found");
        }
    }
}
