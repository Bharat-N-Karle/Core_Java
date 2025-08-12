package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to compare a given string to a specified string buffer.
*/
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first String : ");
        String str1 = sc.nextLine();
        System.out.println("Please enter the second String : ");
        String str2 = sc.nextLine();
        StringBuffer sb = new StringBuffer(str2);
        boolean flag = str1.contentEquals(sb.toString());
        if (flag) {
            System.out.println("The Second String is equal to the First String ");
        }
        else {
            System.out.println("The Second String is not equal to the First String ");
        }
    }
}
