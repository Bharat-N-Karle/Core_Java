package StringQuestions;

import java.util.Scanner;

/*
Write a Java program to create a String object with a character array.
*/
public class Question10 {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e'};
        String result = String.valueOf(ch);
        System.out.println(result);
    }
}
