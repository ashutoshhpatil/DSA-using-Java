package Strings;

public class Anagram {
    public static void main(String[] args) {
        String s = "triangle";
        String t = "integral";

        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        int i = 0;
        while (i < freq.length) {
            if (freq[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
            i++;
        }

        System.out.println("Anagram");
    }
}
