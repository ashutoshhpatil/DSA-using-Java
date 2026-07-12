package Array.Prefix_Sum;

public class CharSubsequnces {
    public static void main(String[] args) {
        char arr[] = new char[] { 'a', 'g', 'b', 'c', 'd', 'r', 'g', 'g', 'g', 'a', 'g' };
        int count = 0;
        int pair = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                count++;
            } else if (arr[i] == 'g') {
                pair = pair + count;
            }
        }
        System.out.println(pair);
    }
}
