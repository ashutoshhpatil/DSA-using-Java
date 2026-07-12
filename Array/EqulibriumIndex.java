package Array.Prefix_Sum;

public class EqulibriumIndex {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 5, 2, 2 };
        int totalsum = 0;
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum - arr[i];
            if (totalsum == leftsum) {
                System.out.println("Equlibrium Index at " + i);
                return;
            }
            leftsum = leftsum + arr[i];
        }
        System.out.println(-1);
    }
}