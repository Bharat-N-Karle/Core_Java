package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Please enter second String: ");
        String str2 = sc.nextLine();
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("First String is equal to Second String ");
        }
        else if (result < 0) {
            System.out.println("First String is less than Second String ");
        }
        else{
            System.out.println("First String is greater than Second String ");
        }
    }
}
