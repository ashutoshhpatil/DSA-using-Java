package Strings;

public class Length_Lastword {
    public static void main(String[] args) {
        String st = "Java is one of the most popular programming language";
        int i = st.length() - 1;
        int count = 0;

        while (i >= 0 && st.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && st.charAt(i) != ' ') {
            count++;
            i--;
        }

        System.out.println("The length of the last word:" + count);
    }
}
