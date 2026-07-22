// Carry Forward Approach

package Array.Subarray;

public class totalSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3 };
        int n = arr.length;
        int TotalSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                TotalSum = TotalSum + sum; // To find out the tottal sum of all the subarray
            }
        }
        System.out.println(TotalSum);
    }
}
