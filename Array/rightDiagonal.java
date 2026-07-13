package Array.Array2D;


public class rightDiagonal {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < arr.length && j >= 0) {
            System.out.println(arr[i][j]);
            i++;
            j--;
        }

    }
}
