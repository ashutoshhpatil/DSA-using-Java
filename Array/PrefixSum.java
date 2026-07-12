package Array.Prefix_Sum;

import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        int N = 10;
        int Q = 3;

        int psArr[] = new int[arr.length];
        psArr[0] = arr[0];
        for (int i = 1; i < N; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(psArr[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < Q; i++) {
            System.out.println("Enter Starting Index");
            int startIndex = sc.nextInt();
            System.out.println("Enter Ending Index");
            int endIndex = sc.nextInt();

            if (startIndex == 0)
                sum = psArr[endIndex];
            else
                sum = psArr[endIndex] - psArr[startIndex - 1];

            System.out.println("The Sum is :" + sum);

        }

    }
}
