package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to compare two strings lexicographically, ignoring case differences.
*/
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Please enter second String: ");
        String str2 = sc.nextLine();
        boolean result = str1.equalsIgnoreCase(str2);
        if (result) {
            System.out.println("First String is equal to Second String ");
        }
        else {
            System.out.println("First String is not equal to Second String ");
        }
    }
}
