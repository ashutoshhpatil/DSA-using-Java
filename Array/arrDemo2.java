/*Given an array of size n
 * Return the count of pairs(i,j) with Arr[i]+Arr[j] = k
 * k = 10
 */

package Array.ArrayBasics;

public class arrDemo2 {
    public static void main(String[] args) {

        int n = 10;
        int count = 0;
        int k = 10;
        int arr[] = new int[] { 3, 5, 2, 1, -3, 7, 8, 15, 6, 13 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

// Time Complexity : O(N^2)
// Space Complexity : O(1)