package Array.Subarray;

public class subarrayPrefixSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3 };
        int n = arr.length;
        int sum = 0;
        int count = 0;

        int psArr[] = new int[n];
        psArr[0] = arr[0];

        for (int i = 1; i < n; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
                if (i == 0)
                    sum = psArr[j];
                else
                    sum = psArr[j] - psArr[i - 1];
                System.out.println( sum);
            }
        }
        System.out.println("The Count is: " + count);
    }
}
