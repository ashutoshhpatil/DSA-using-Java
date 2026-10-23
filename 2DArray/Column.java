package Array.Array2D;

public class Column {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}

/*
 * 1 6
 * 2 7
 * 3 8
 * 4 9
 * 5 10
 */