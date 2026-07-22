package Array.Subarray;
public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int psArr[] = new int[n];
        psArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0)
                    sum = psArr[j];
                else
                    sum = psArr[j] - psArr[i - 1];
                if (sum > maxsum)
                    maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}

// Carry Forward Approach
/*
 * for(int i=0;i<n;i++){
 * int sum = 0;
 * for(int j =i;j<n;j++){
 * sum = sum + arr[j]
 * 
 * if(sum>maxsum)
 * maxsum =sum;
 * }
 * }
 * sout(sum)
 */