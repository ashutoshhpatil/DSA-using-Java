package Strings;

public class Reverse_String {
    public static void main(String[] args) {
        String st = "TEKCIRC";

        char arr[] = st.toCharArray();
        int left = 0;
        int right = st.length() - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(arr);
    }
}
