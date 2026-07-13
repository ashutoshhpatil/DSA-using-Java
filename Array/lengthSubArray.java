package Array.Sliding_Window;

public class lengthSubArray {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int k = 3;
        int start = 0;

        for (int end = k - 1; end < arr.length; end++) {
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            start++;

        }
    }
}
