package Array.Array2D;

//Given a matrix of size N*M. Print all the diagonals from Right to Left.(Note:Row must be 

public class RightLeftDiagonals {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 }
        };

        // int n = arr.length;

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = cols - 1; i >= 0; i--) {
            int x = 0;
            int y = i;
            while (x < rows && y >= 0) {
                System.out.print(arr[x][y] + " ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
}
