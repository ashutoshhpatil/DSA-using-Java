package Array.Array2D;

// For Perfect Square Matrix only

class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 7, 8, 9, 10, 11 },
                { 13, 14, 15, 16, 17 },
                { 19, 20, 21, 22, 23 },
                { 25, 26, 27, 28, 29 }
        };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
