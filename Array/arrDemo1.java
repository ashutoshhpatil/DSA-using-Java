/*  Given an integer array of size N.
 Count the number of elements having atleast 1 element greater than itself 
 Arr : [ 2,5,1,4,8,0,8,1,3,8]
 N: 10
 output: 7 */

package Array.ArrayBasics;

class ArrDemo1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
        int n = 10;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

// Time Complexity : O(N^2)
// Space Complexity : O(1)
