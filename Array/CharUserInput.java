package Array.Prefix_Sum;

import java.util.Scanner;

public class CharUserInput {
    public static void main(String[] args) {
        char arr[] = new char[] { 'a', 'g', 'b', 'c', 'd', 'r', 'g', 'c', 'g', 'b', 'c' };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first char:");
        char x = sc.next().charAt(0);
        System.out.println("Enter Second char:");
        char y = sc.next().charAt(0);

        int count = 0;
        int pair = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }

            if (arr[i] == y) {
                pair += count;
            }
        }

        System.out.println(pair);
    }
}
