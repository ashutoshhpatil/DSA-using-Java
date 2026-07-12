package Array.Prefix_Sum;

class Rightmax {
    public static void main(String[] args) {
        int arr[] = new int[] { -10, -5, -20, -2, -8 };
        int n = arr.length;
        int rightmax[] = new int[n];

        int maxelement = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxelement) {
                maxelement = arr[i];
            }
            rightmax[i] = maxelement;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rightmax[i] + " ");
        }
    }
}