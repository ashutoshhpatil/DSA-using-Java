package Array.Sliding_Window;

public class Count_Subarray {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int n = arr.length;
        int k = 4;
        int start = 0;
        int end = k - 1;
        int count = 0;

        while (end < n) {
            count++;
            start++;
            end++;
        }

        System.out.println(count);
    }
}
