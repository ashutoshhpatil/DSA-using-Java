package Array.Subarray;

class Zsubarraypractice {
    static int[] psarr;

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 4, 3 };
        int n = arr.length;
        int sum = 0;
        int totalsum = 0;

        psarr = new int[n];
        psarr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psarr[i] = psarr[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = psarr[j];
                } else {
                    sum = psarr[j] - psarr[i - 1];
                }
                System.out.println(sum);
                totalsum += sum;
            }
        }
        System.out.println("The Total sum of all the subarray is: " + totalsum);

    }
}