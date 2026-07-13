package Array.Array2D;

public class Spiral_NonSquare {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {

            // left to right
            for (int x = left; x <= right; x++) {
                System.out.print(arr[top][x] + " ");
            }
            top++;

            // top to bottom
            for (int x = top; x <= bottom; x++) {
                System.out.print(arr[x][right] + " ");
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int x = right; x >= left; x--) {
                    System.out.print(arr[bottom][x] + " ");
                }
            }
            bottom--;

            // bottom to top
            if (left <= right) {
                for (int x = bottom; x >= top; x--) {
                    System.out.print(arr[x][left] + " ");
                }
            }
            left++;
        }
    }
}
