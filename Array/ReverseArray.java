/* Given an array of size n.
 * Reverse the array without using extra space.
 * Space Complexity : O(1)
 * 
 * Arr :[8,4,1,3,9,2,6,7]
 */

package Array.ArrayBasics;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 8, 4, 1, 3, 9, 2, 6, 7 };
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
