package Array.Prefix_Sum;

import java.util.Scanner;

public class rangeSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 7, 4, 11, 6, 9 };
        int n = 7;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Index:");
        int startIndex = sc.nextInt();
        if (startIndex < 0) {
            System.out.println("Plaease enter starting Index > 0");
            return;
        }
        System.out.println("Enter Ending Index:");
        int endIndex = sc.nextInt();

        for (int i = startIndex; i <= endIndex; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The Sum is :" + sum);
    }
}


