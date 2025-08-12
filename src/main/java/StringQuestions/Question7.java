package StringQuestions;
/*
Write a Java program to concatenate a given string to the end of another string.
*/


import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First String: ");
        String str1 = sc.nextLine();
        System.out.println("Please enter second String: ");
        String str2 = sc.nextLine();
        String str3 = str1.concat(str2);
        System.out.println("Concated string is: " + str3);
    }
}
