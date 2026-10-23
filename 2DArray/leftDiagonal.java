package Array.Array2D;


public class leftDiagonal {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
    }
}
