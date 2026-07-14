package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String st = "1A Toyota! Race fast, safe car! A Toyota";
        int left = 0;
        int right = st.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(st.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(st.charAt(right))) {
                right--;
            }

            char leftchar = Character.toLowerCase(st.charAt(left));
            char rightchar = Character.toLowerCase(st.charAt(right));

            if (leftchar != rightchar) {
                System.out.println("Not Palindrome");
                return;
            }

            left++;
            right--;
        }

        System.out.println("Palindrome");

    }
}
