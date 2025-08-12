package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to test if a given string contains the specified sequence of char values.
*/
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Please enter second String: ");
        String str2 = sc.nextLine();
        boolean result = str1.contains(str2);
        if (result) {
            System.out.println("First String contains the Second String ");
        }
        else {
            System.out.println("First String does not contain the Second String ");
        }
    }
}
